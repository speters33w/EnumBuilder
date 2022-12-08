package com.speters33w.csv_enumbuilder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class Main {

    private Main() {

    }

    public static void main(String[] args) {
        String csvFile = "file.csv";
        String enumName;
        String enumFile;
        CsvEnumBuilder generator;

        if (args.length >= 1) {
            csvFile = args[0];
        }

        if (args.length >= 2) {
            enumName = args[1];
            generator = new CsvEnumBuilder(csvFile, enumName);
        } else {
            generator = new CsvEnumBuilder(csvFile);
        }
        String enumGenerated = String.valueOf(generator.getEnum());
        if (args.length == 3) {
            enumFile = args[2];
        } else {
            enumFile = generator.getEnumName() + ".java";
        }
        writeToFile(enumGenerated, enumFile);
    }

    public static void writeToFile(String data, String fileName) {
        try {
            Path path = Paths.get(fileName);
            Files.write(path, Collections.singleton(data), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
