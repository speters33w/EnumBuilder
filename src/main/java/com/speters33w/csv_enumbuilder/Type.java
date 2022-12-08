package com.speters33w.csv_enumbuilder;

public enum Type {
    BOOL("boolean", "", "", "false"),
    BOOLEAN("Boolean", "", "", "null"),
    BYTE("byte", "", "", "-1"),
    CHAR("char", "'", "'", "\u0000"),
    CHARACTER("Character", "'", "'", "\u0000"),
    DOUBLE("double", "", "", "-1"),
    FLOAT("float", "", "F", "-1"),
    INT("int", "", "", "-1"),
    INTEGER("Integer", "", "", "-1"),
    LONG("long", "", "L", "-1"),
    OBJECT("Object", "", "", "null"),
    SHORT("short", "", "", "-1"),
    STRING("String", "\"", "\"", "");
    private final String type;
    private final String prefix;
    private String suffix;
    private final String isEmpty;

    Type(String type, String prefix, String suffix, String isEmpty) {
        this.type = type;
        this.prefix = prefix;
        this.suffix = suffix;
        this.isEmpty = isEmpty;
    }

    public static Type type(String variableType) {
        String type = variableType;
        if (variableType.endsWith(")")) {
            type = variableType.substring(0, variableType.length() - 1);
        }
        if (variableType.equals("Boolean")) {
            return Type.BOOLEAN;
        }
        for (Type value : Type.values()) {
            if (value.type.equalsIgnoreCase(type)) {
                return value;
            }
        }
        return Type.OBJECT;
    }

    public String prefix() {
        return prefix;
    }

    public String suffix() {
        return suffix;
    }

    public String isEmpty() {
        return isEmpty;
    }

    void closeParenthesis(boolean close) {
        if (close) {
            if (!suffix.endsWith(")")) {
                this.suffix = suffix + ")";
            }
        } else if (suffix.endsWith(")")) {
            this.suffix = suffix.substring(0, suffix.length() - 1);
        }
    }


}
