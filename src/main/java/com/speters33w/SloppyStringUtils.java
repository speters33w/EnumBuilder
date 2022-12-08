package com.speters33w;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.text.CaseUtils;

import java.util.regex.Pattern;

public class SloppyStringUtils {

    /**
     * Converts text to CamelCase.
     * All accented characters are normalized (accents removed).
     * All non-alphanumeric characters or sequences of non-alphanumeric characters are removed.
     *
     * @param string                The text to convert.
     * @param capitalizeFirstLetter true to capitalize first letter of each word.
     * @return The ConvertedText.
     */
    public static String toCamelCase(String string, final boolean capitalizeFirstLetter) {
        if (string.isEmpty()) {
            return string;
        }
        return CaseUtils.toCamelCase(toSnakeCase(string), capitalizeFirstLetter, '_');
    }

    /**
     * Converts text to lowerCamelCase.
     * All accented characters are normalized (accents removed).
     * All non-alphanumeric characters or sequences of non-alphanumeric characters are removed.
     *
     * @param string The text to convert.
     * @return The convertedText.
     */
    public static String toLowerCamelCase(String string) {
        if (string.isEmpty()) {
            return string;
        }
        String str = toCamelCase(string, true);
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    /**
     * Converts text to snake_case.
     * This method does not perform any capitalization or UpperCase or LowerCase conversion.
     * All accented characters are normalized (accents removed).
     * All non-alphanumeric characters or sequences of non-alphanumeric characters are converted to underscore ('_').
     *
     * @param string The text to convert.
     * @return The converted_text.
     */
    public static String toSnakeCase(String string) {
        if (string.isEmpty()) {
            return string;
        }
        String ansi = StringUtils.stripAccents(string);
        StringBuilder snake = new StringBuilder();
        for (int i = 0; i < ansi.length(); i++) {
            if (i > 0 && !Pattern.matches("[0-9A-Za-z'\u2019]", Character.toString(ansi.charAt(i)))) {
                if (snake.charAt(snake.length() - 1) != '_' && i != ansi.length() - 1) {
                    snake.append("_");
                }
            } else if (ansi.charAt(i) != '\'' && ansi.charAt(i) != '\u2019') {
                snake.append(ansi.charAt(i));
            }
        }

        return snake.toString();
    }

    /**
     * Returns true if a String can be interpreted as an integer.
     * @param numString The string to test.
     * @return true if the string can be interpreted as an integer.
     */
    public static Boolean isInteger(String numString){
        return NumberUtils.isDigits(numString) ||
               (numString.startsWith("-") &&
                NumberUtils.isDigits(numString.replace("-", "")));
    }

}
