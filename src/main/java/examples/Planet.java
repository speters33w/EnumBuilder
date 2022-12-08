package examples;

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
