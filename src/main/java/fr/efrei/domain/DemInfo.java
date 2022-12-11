package fr.efrei.domain;

public class DemInfo {
    private String race;
    private String gender;

    public DemInfo(Builder builder) {
        this.race = builder.race;
        this.gender = builder.gender;
    }

    public String getRace() {
        return race;
    }


    public String getGender() {
        return gender;
    }


    public static class Builder {
        private String race;
        private String gender;

        public Builder setRace(String race) {
            this.race = race;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        private Builder copy(DemInfo dm){
            this.race = dm.race;
            this.gender = dm.gender;
            return this;
        }
        public DemInfo build(){
            return new DemInfo(this);
        }
    }
}

