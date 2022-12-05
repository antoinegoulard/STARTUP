package fr.efrei.domain;

public class Demographic_Information {
    private String race;
    private String gender;

    public Demographic_Information(String race, String gender) {
        this.race = race;
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
