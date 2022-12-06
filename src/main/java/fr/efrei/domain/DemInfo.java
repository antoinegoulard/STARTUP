package fr.efrei.domain;

public class DemInfo {
    private String race;
    private String gender;

    public Demographic_Information(String race, String gender) {
        this.race = race;
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public String getGender() {
        return gender;
    }

}
