package examples;

public enum Primitive {

    BIG_VALUE(2147483647, "BIG_HUGE_ENORMOUS", 'Z', 9223372036854775807L, 34028234663852886.000000F, 17976931348623157.000000, true),
    LITTLE_VALUE(-2147483647, "little", 'a', -9223372036854775807L, 0.0F, 0.0, false),
    BLANK_VALUE(-1, "", '\u0000', -1L, -1F, -1, false);

    private final int integer;
    private final String stringer;
    private final char character;
    private final long longer;
    private final float floater;
    private final double doubler;
    private final boolean truer;

    Primitive(int integer, String stringer, char character, long longer, float floater, double doubler, boolean truer) {
        this.integer = integer;
        this.stringer = stringer;
        this.character = character;
        this.longer = longer;
        this.floater = floater;
        this.doubler = doubler;
        this.truer = truer;
    }

    public int getInteger() {
        return this.integer;
    }

    public String getStringer() {
        return this.stringer;
    }

    public char getCharacter() {
        return this.character;
    }

    public long getLonger() {
        return this.longer;
    }

    public float getFloater() {
        return this.floater;
    }

    public double getDoubler() {
        return this.doubler;
    }

    public boolean getTruer() {
        return this.truer;
    }

}
