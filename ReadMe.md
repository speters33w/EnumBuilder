# CSV Enum Builder

**Create Java Enums from csv files - Just add imports;**

EnumBuilder will generate a full Java enum that requires very little manual editing or post-processing from a CSV file. 

EnumBuilder can also be used to create a huge, nasty enum with a bazillion values from a csv spreadsheet, which is much easier to create than a complex enum.

What began as some tweaks to Dane Sisinni's **[enum-generator-from-csv-java](https://github.com/speters33w/enum-generator-from-csv-java)**, ballooned into this project.
I needed a tool like this for an enum of the Periodic Table of Elements I have been working on. 
This is a complete re-write of Dan Sisinni's work and is a new project, rather than a branch or revision.

**EnumBuilder takes this:**

| Planet  | Number |
|---------|--------|
| Mercury | 1      |
| Venus   | 2      |
| Earth   | 3      |
| Mars    | 4      |
| Jupiter | 5      |
| Saturn  | 6      |
| Uranus  | 7      |
| Neptune | 8      |
| Pluto   | 9      |

**and turns it into this:**

```java
public enum Planet { 

    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8),
    PLUTO(9);

    private final int number;

    Planet(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

}

```



Variable types and names can be guessed by the program or specifically defined to generate the Enum.

Class Types or Objects may also be defined in the CSV before generation.



**Source Dependencies: **

- **Note - the jar file is runnable without any additional imports or downloads, but does require Java 11 or higher.**

**Java 11**

- Note - Generated enums should run on Java 5 (1.5).

**Lombok 1.18.24**

**Apache commons-collections4 4.4**

**Apache commons-csv 1.9.0**

**Apache commons-text 1.10.0**

**Apache commons-lang3 3.12.0**



@see Maven [pom.xml](pom.xml) in the project source.



## Using CSV EnumBuilder from a shell or command line:

To generate an enum from a CSV file using EnumBuilder.jar, use the command:

```bash
java -jar EnumBuilder.jar [CSVFile] [EnumName] [EnumFile]
```

EnumBuilder.jar is located in `out/artifacts/EnumBuilder_jar/`

### Usage:

```bash
java -jar EnumBuilder.jar [path/to/filename.csv](required) [EnumName](optional, defaults to the header of the first row in UpperCamelcase) [path/to/filename.java](optional, defaults to %EnumName%.java)
```



## Generating an Enum from a raw CSV file:

The CSV file ***must*** have headers in ***every*** column, and each header must include **at least one** alphabetic ([A-Za-z]) character.

**All** cells in the first column including the header ***must*** be populated, and include **at least one** alphanumeric ([0-9A-Za-z]) character. (Subsequent columns may have blank cells.)

The cells in the first row should be representative of the datatype you want in the enum. If necessary, cut and paste a representative row to the top row underneath the header.
EnumBuilder will attempt to determine the Type, currently limited to `int`, `double`, and `String`. If the value with whitespaces stripped is not parsable as a number, it will select String. It uses the **first row after the header** to make its guess. If this row is a good representation of the data types, it will reduce or eliminate the need for manual editing of the generated enum.

Example: planets.csv:

| Planet  | Distance from the sun (AU) | Period of revolution (days) | Period of rotation (hours) | Mass (earth=1) | Diameter (earth=1) | Number of confirmed satellites | Symbol |
|---------|----------------------------|-----------------------------|----------------------------|----------------|--------------------|--------------------------------|--------|
| Mercury | 0.39                       | 88                          | 1408                       | 0.06           | 0.38               | 0                              | ☿      |
| Venus   | 0.72                       | 225                         | 5832                       | 0.82           | 0.95               | 0                              | ♀      |
| Earth   | 1                          | 365                         | 24                         | 1              | 1                  | 1                              | ♁      |
| Mars    | 1.52                       | 687                         | 25                         | 0.11           | 0.53               | 2                              | ♂      |
| Jupiter | 5.2                        | 4333                        | 10                         | 317.89         | 11.19              | 63                             | ♃      |
| Saturn  | 9.54                       | 10756                       | 11                         | 95.15          | 9.44               | 61                             | ♄      |
| Uranus  | 19.2                       | 30687                       | 17                         | 14.54          | 4.1                | 27                             | ♅      |
| Neptune | 30.06                      | 60190                       | 16                         | 17.23          | 3.88               | 14                             | ♆      |
| Pluto   | 39                         | 2170000                     | 153                        | 0.01           | 0.19               | 5                              | ♇      | 



Command:

```bash
java -jar EnumBuilder.jar planets.csv
```



Output: Planet.java
```java
public enum Planet {

    MERCURY(0.39, 88, 1408, 0.06, 0.38, 0, "\u263F"),
    VENUS(0.72, 225, 5832, 0.82, 0.95, 0, "\u2640"),
    EARTH(1, 365, 24, 1, 1, 1, "\u2641"),
    MARS(1.52, 687, 25, 0.11, 0.53, 2, "\u2642"),
    JUPITER(5.2, 4333, 10, 317.89, 11.19, 63, "\u2643"),
    SATURN(9.54, 10756, 11, 95.15, 9.44, 61, "\u2644"),
    URANUS(19.2, 30687, 17, 14.54, 4.1, 27, "\u2645"),
    NEPTUNE(30.06, 60190, 16, 17.23, 3.88, 14, "\u2646"),
    PLUTO(39, 2170000, 153, 0.01, 0.19, 5, "\u2647");

    private final double distanceFromTheSunAu;
    private final int periodOfRevolutionDays;
    private final int periodOfRotationHours;
    private final double massEarth1;
    private final double diameterEarth1;
    private final int numberOfConfirmedSatellites;
    private final String symbol;

    Planet(double distanceFromTheSunAu, int periodOfRevolutionDays, int periodOfRotationHours, double massEarth1, double diameterEarth1, int numberOfConfirmedSatellites, String symbol) {
        this.distanceFromTheSunAu = distanceFromTheSunAu;
        this.periodOfRevolutionDays = periodOfRevolutionDays;
        this.periodOfRotationHours = periodOfRotationHours;
        this.massEarth1 = massEarth1;
        this.diameterEarth1 = diameterEarth1;
        this.numberOfConfirmedSatellites = numberOfConfirmedSatellites;
        this.symbol = symbol;
    }

    public double getDistanceFromTheSunAu() {
        return this.distanceFromTheSunAu;
    }

    public int getPeriodOfRevolutionDays() {
        return this.periodOfRevolutionDays;
    }

    public int getPeriodOfRotationHours() {
        return this.periodOfRotationHours;
    }

    public double getMassEarth1() {
        return this.massEarth1;
    }

    public double getDiameterEarth1() {
        return this.diameterEarth1;
    }

    public int getNumberOfConfirmedSatellites() {
        return this.numberOfConfirmedSatellites;
    }

    public String getSymbol() {
        return this.symbol;
    }

}

```

Yes, according to these files – Pluto is, indeed, a planet.



## Defining primitive variable types in the CSV file:

To reduce manual editing of the enum, the type and name of each variable may be defined in the header row. The constant name may also be defined in the first row. Values in the first row will be converted to SNAKE_CASE by the program.

To do this, format each header cell like this:

```java
Type variableName
```

The header cell of the first column will become the enum Name in UpperCamelCase unless you specify an enum Name in the shell or command line argument. 

| VALUE        | int integer | String stringer   | char character | long longer          | float floater            | double doubler           | boolean truer |
|--------------|-------------|-------------------|----------------|----------------------|--------------------------|--------------------------|---------------|
| BIG_VALUE    | 2147483647  | BIG_HUGE_ENORMOUS | Z              | 9223372036854775807  | 34028234663852886.000000 | 17976931348623157.000000 | true          |
| LITTLE_VALUE | -2147483647 | little            | a              | -9223372036854775807 | 0.0                      | 0.0                      | false         |
| BLANK_VALUE  |             |                   |                |                      |                          |                          |               |

Command:

```bash
java -jar EnumBuilder.jar primitives.csv Primitive
```

Output: Primitive.java

```java
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

```



## Defining Class Types or Objects in the CSV file:

If the CSV file contains values that should be Class Types or Objects in the enum, pre-formatting the Class Type or Object is very helpful.

If the following were a CSV file you wanted to use as an enum for a simple text-based game using a`java.awt.Point` Object as the player location;

| Cardinal Direction | Map Direction | x Shift | y Shift | Cardinal Abbreviation | User Input |
|--------------------|---------------|---------|---------|-----------------------|------------|
| North              | up            | 0       | -1      | N                     | u          |
| West               | left          | -1      | 0       | W                     | l          |
| South              | down          | 0       | 1       | S                     | d          |
| East               | right         | 1       | 0       | E                     | r          |

just running it through EnumBuilder would get you this output:

```java
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

```

While this is usable, it would require a lot of additional editing and a few methods.

EnumBuilder allows you to modify the CSV file to generate non-primitive types.

The signature of `java.awt.Point` is `Point(int x, int y)`. You would instantiate the point something like this:
```java
Point location = new Point(0,0);
```

For EnumBuilder to translate this from CSV to code, you will have to add a column before the "x Shift" column. This column is where you will place the instantiating statements. In this case all cells in this column except for the header should read: `new Point(`. The header or this new column should read the Type (`Point`) followed by a space, followed by the name for the enum field `shift` followed by an opening left parenthesis to indicate the following columns are arguments.

The header of the new column should read: `Point shift(`
The rest of the cells in the new column should read: `new Point(`

The header for the following two columns, x Shift and y Shift should only have the argument Type, `int`.
In the last argument, "y Shift," the Type needs to be followed by a closing right parenthesis.

- Note - EnumBuilder only uses this Type info in the header to determine if the argument should be surrounded by quotes, single quotes, or nothing. So if the header read `double | double)` or `boolean | boolean)` instead of `int | int)`, there would be no actual change in output.

So the three column headers declaring Point shift should look like this:

|`Point shift(`|  `int` | `int)` |

Add the rest of the types and constant names, and the CSV file should look something like this:


| DIRECTION | String cardinal | String map | Point shift( | int | int) | char cardChar | char mapChar |
|-----------|-----------------|------------|--------------|-----|------|---------------|--------------|
| NORTH     | North           | up         | new Point(   | 0   | -1   | N             | u            |
| WEST      | West            | left       | new Point(   | -1  | 0    | W             | l            |
| SOUTH     | South           | down       | new Point(   | 0   | 1    | S             | d            |
| EAST      | East            | right      | new Point(   | 1   | 0    | E             | r            |

Now when the CSV file is fed to EnumBuilder the output looks like this:

```java
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

```

You will have to add the Point import statement to the top of the enum file:
```java
import java.awt.Point;
```







