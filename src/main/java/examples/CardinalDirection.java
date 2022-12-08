package examples;

public enum CardinalDirection {

    NORTH("up", 0, -1, "N", "u"),
    WEST("left", -1, 0, "W", "l"),
    SOUTH("down", 0, 1, "S", "d"),
    EAST("right", 1, 0, "E", "r");

    private final String mapDirection;
    private final int xShift;
    private final int yShift;
    private final String cardinalAbbreviation;
    private final String userInput;

    CardinalDirection(String mapDirection, int xShift, int yShift, String cardinalAbbreviation, String userInput) {
        this.mapDirection = mapDirection;
        this.xShift = xShift;
        this.yShift = yShift;
        this.cardinalAbbreviation = cardinalAbbreviation;
        this.userInput = userInput;
    }

    public String getMapDirection() {
        return this.mapDirection;
    }

    public int getXShift() {
        return this.xShift;
    }

    public int getYShift() {
        return this.yShift;
    }

    public String getCardinalAbbreviation() {
        return this.cardinalAbbreviation;
    }

    public String getUserInput() {
        return this.userInput;
    }

}
