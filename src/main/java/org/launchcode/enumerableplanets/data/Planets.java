package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY("Mercury", 88, 2439.4),
    VENUS("Venus", 225, 6051.8),
    EARTH("Earth", 36, 6378.1),
    MARS("Mars", 687, 3396.2),
    JUPITER("Jupiter", 4333,71492.0),
    SATURN("Saturn", 10759, 60268.0),
    URANUS("Uranus", 30687, 25559.0),
    NEPTUNE("Neptune", 60200, 24764.0);

    private final String name;
    private final int yearLength;
    private final double radius;
    Planets(String name, int yearLength, double radius) {
        this.name = name;
        this.yearLength = yearLength;
        this.radius = radius;
    }

    public String getName() {
        return this.name;
    }

    public int getYearLength() {
        return this.yearLength;
    }

    public double getRadius() {
        return this.radius;
    }
}
