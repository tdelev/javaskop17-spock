package me.delev.javaskop17;

/**
 * The space ship
 */
public class Starship {
    private final String name;
    private final String scienceOfficer;

    public Starship(String name, String scienceOfficer) {
        this.name = name;
        this.scienceOfficer = scienceOfficer;
    }

    public String getScienceOfficer() {
        return scienceOfficer;
    }
}
