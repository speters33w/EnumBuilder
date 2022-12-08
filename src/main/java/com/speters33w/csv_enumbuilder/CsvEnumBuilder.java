package com.speters33w.csv_enumbuilder;

import com.speters33w.SloppyStringUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.val;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.text.StringEscapeUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Builds a Java enum from a CSV file.
 */
public class CsvEnumBuilder {
    private final String csvFile;
    private String enumName = "";

    void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    public String getEnumName() {
        return enumName;
    }

    /**
     * Builds a Java enum from a CSV file.
     *
     * @param csvFile the CSV file to read from.
     */
    public CsvEnumBuilder(String csvFile) {
        this.csvFile = csvFile;
    }

    /**
     * Builds a Java enum from a CSV file.
     *
     * @param csvFile  the CSV file to read from.
     * @param enumName the name of the enum to build.
     */
    public CsvEnumBuilder(String csvFile, String enumName) {
        this.csvFile = csvFile;
        this.enumName = enumName;
    }

    /**
     * Builds the Enum from the given CSV file from the data read in getDataFromFileThrowsException.
     *
     * @return the generated Enum as a string.
     * @see #getDataFromFile
     * @see #getDataFromFileThrowsException
     */
    public String getEnum() {

        // Read the CSV file.
        val enumWrapper = getDataFromFile();
        val enumBuilder = new StringBuilder();
        val fields = enumWrapper.getFields();

        // Build the front matter.
        enumBuilder.append(String.format("public enum %s { %n%n", enumName));

        // Retrieve the stored record data from the CSV parser and build the Enum data lines.
        int j = 1;
        for (List<ImmutablePair<String, String>> entry : enumWrapper.getEnumData()) {
            enumBuilder.append(String.format("    %s(", entry.get(0).getRight()));

            for (int i = 1; i < entry.size(); i++) {
                val constantType = entry.get(i).getLeft();
                val type = Type.type(constantType);
                String constantName = entry.get(i).getRight();
                if (constantName.isEmpty()) {
                    constantName = type.isEmpty();
                }
                type.closeParenthesis(constantType.endsWith(")"));
                enumBuilder.append(String.format("%s%s%s",
                        type.prefix(), StringEscapeUtils.escapeJava(constantName), type.suffix()));
                if (enumBuilder.charAt(enumBuilder.length() - 1) != '(' && i != entry.size() - 1) {
                    enumBuilder.append(", ");
                }

            }
            if (j != enumWrapper.getEnumData().size()) {
                enumBuilder.append("),\n");
            } else {
                enumBuilder.append(");\n\n");
            }
            j++;
        }


        // Create field variables.
        j = 0;
        for (ImmutablePair<String, String> field : fields) {
            enumBuilder.append(String.format("    private final %s %s;%n",
                    field.getLeft(), field.getRight()));
            j++;
        }


        // Create constructor.
        enumBuilder.append(String.format("%n    %s(", enumName));
        for (ImmutablePair<String, String> field : fields) {
            enumBuilder.append(String.format("%s %s", field.getLeft(), field.getRight()));
            if (j > 1) {
                enumBuilder.append(", ");
            } else {
                enumBuilder.append(") {\n");
            }
            j--;
        }
        for (ImmutablePair<String, String> field : fields) {
            enumBuilder.append(String.format("        this.%s = %s;%n",
                    field.getRight(),
                    field.getRight()));
        }
        enumBuilder.append("    }\n\n");


        // Create getters.
        for (ImmutablePair<String, String> field : fields) {
            enumBuilder.append(String.format("    public %s get%s() {%n        return this.%s;%n    }%n%n",
                    field.getLeft(), StringUtils.capitalize(field.getRight()), field.getRight()));
        }

        // Add final closing brace.
        enumBuilder.append("}");

        // Return the Enum.
        System.out.println(enumBuilder);
        return enumBuilder.toString();
    }

    /**
     * Reads the data from a CSV file and returns the result.
     *
     * @return the data from the CSV file as an EnumWrapper.
     * @see EnumWrapper
     */
    private EnumWrapper getDataFromFile() {
        final EnumWrapper data;
        try {
            data = getDataFromFileThrowsException();
        } catch (IOException | IllegalArgumentException ex) {
            throw new IllegalStateException(String.format("Unable to parse file: %s", csvFile), ex);
        }

        return data;
    }

    /**
     * Reads the data from a CSV file and returns the result.
     * Throws IOException if the file is not accessible.
     *
     * @return the data from the CSV file as an EnumWrapper.
     * @throws IOException              if the file is not accessible.
     * @throws IllegalArgumentException if the headers are not formatted correctly.
     * @see EnumWrapper
     */
    private EnumWrapper getDataFromFileThrowsException() throws IOException, IllegalArgumentException {

        // Read the data from the CSV file into records.
        List<List<ImmutablePair<String, String>>> data = new ArrayList<>();
        val fileReader = new InputStreamReader(new FileInputStream(csvFile), StandardCharsets.UTF_8);
        val csvFormat = CSVFormat.Builder.create()
                .setHeader()
                .setDelimiter(',')
                .setQuote('"')
                .setRecordSeparator("\r\n")
                .setAllowDuplicateHeaderNames(true)
                .setIgnoreEmptyLines(true)
                .build();


        // Read the CSV file into records.
        val parser = csvFormat.parse(fileReader);
        val records = parser.getRecords();
        val headerNames = parser.getHeaderNames();
        if (enumName.isEmpty()) {
            setEnumName(SloppyStringUtils.toCamelCase(headerNames.get(0).strip(), true));
        }


        // Get variable and Object parameter types from the header of the CSV file.
        // Defined Object types will end as (, defined Object parameter list ending constant Types will end as ).
        List<ImmutablePair<String, String>> constants = new ArrayList<>();
        List<ImmutablePair<String, String>> fields = new ArrayList<>();
        for (int i = 0; i < headerNames.size(); i++) {
            val headerSplits = headerNames.get(i).strip().split(" ");
            String type = headerSplits[0];
            List<String> makeName = Arrays.asList(headerSplits).subList(1, headerSplits.length);
            // note "[" or "]" sometimes remains as an artifact, so it is stripped here.
            String constantName = makeName.toString().replace("]", "");

            if (Type.type(type).equals(Type.OBJECT) && i != 0
                && !(headerSplits.length == 2 && headerSplits[1].charAt(headerSplits[1].length() - 1) == '(')) {
                constantName = SloppyStringUtils.toLowerCamelCase(headerNames.get(i).strip());
                if (!NumberUtils.isParsable(records.get(0).get(i))) {
                    type = "String";
                } else if (SloppyStringUtils.isInteger(records.get(0).get(i))) {
                    type = "int";
                } else {
                    type = "double";
                }
                fields.add(new ImmutablePair<>(type, constantName));

                // Create variable types for formatted csv files.
            } else {
                if (headerSplits.length == 2 && i !=0) {
                    // note "[" or "]" sometimes remains as an artifact, so it is stripped here.
                    if (headerSplits[1].charAt(headerSplits[1].length() - 1) == '(') {
                        fields.add(new ImmutablePair<>(type, constantName.replaceAll("[(\\[]", "")));
                    } else {
                        fields.add(new ImmutablePair<>(type, constantName.replace("[", "")));
                    }
                }
            }
            constants.add(new ImmutablePair<>(type, constantName));
        }


        // generate the raw data values for each Enum line.
        for (CSVRecord record : records) {
            int i = 0;
            List<ImmutablePair<String, String>> entry = new ArrayList<>();
            for (ImmutablePair<String, String> column : constants) {
                String header = column.getKey();
                String[] headerSplits = header.split(" ");
                String value = record.get(i);
                if (i > 0) {
                    entry.add(new ImmutablePair<>(headerSplits[headerSplits.length - 1], value));
                } else {
                    if (!Pattern.matches("[A-Za-z]", Character.toString(value.charAt(0)))) {
                        value = "VALUE_" + value;
                    }
                    entry.add(new ImmutablePair<>(headerSplits[headerSplits.length - 1],
                            SloppyStringUtils.toSnakeCase(value).toUpperCase()));
                }
                i++;
            }
            data.add(List.copyOf(entry));
        }

        fileReader.close();

        return new EnumWrapper(List.copyOf(data), List.copyOf(fields));
    }

    /**
     * Class to store the data constructed from CSV file.<br>
     * enumData: the data from each row of the CSV file.<br>
     * format (each pair): L = [Type] R = [Value]<br>
     * fields: Data types for the variables used as fields and constructor parameters of the CSV file<br>
     * format (each pair): L = [Type] R = [Value].<br>
     */
    @Data
    @AllArgsConstructor
    static class EnumWrapper {
        private List<List<ImmutablePair<String, String>>> enumData;
        private List<ImmutablePair<String, String>> fields;
    }

}
