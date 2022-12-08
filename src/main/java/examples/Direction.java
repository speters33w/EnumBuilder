package examples;

import java.awt.Point;

public enum Direction {

    NORTH("North", "up", new Point(0, -1), 'N', 'u'),
    WEST("West", "left", new Point(-1, 0), 'W', 'l'),
    SOUTH("South", "down", new Point(0, 1), 'S', 'd'),
    EAST("East", "right", new Point(1, 0), 'E', 'r');

    private final String cardinal;
    private final String map;
    private final Point shift;
    private final char cardChar;
    private final char mapChar;

    Direction(String cardinal, String map, Point shift, char cardChar, char mapChar) {
        this.cardinal = cardinal;
        this.map = map;
        this.shift = shift;
        this.cardChar = cardChar;
        this.mapChar = mapChar;
    }

    public String getCardinal() {
        return this.cardinal;
    }

    public String getMap() {
        return this.map;
    }

    public Point getShift() {
        return this.shift;
    }

    public char getCardChar() {
        return this.cardChar;
    }

    public char getMapChar() {
        return this.mapChar;
    }

}
