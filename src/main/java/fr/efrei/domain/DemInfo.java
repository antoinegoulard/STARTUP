package fr.efrei.domain;

public class DemInfo {
    private String race;
    private String gender;

    public DemInfo(Contact.Builder builder) {
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

        public Contact.Builder setRace(String race) {
            this.race = race;
            return this;
        }

        public Contact.Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        private Contact.Builder copy(Contact cnt){
            this.race = cnt.race;
            this.gender = cnt.gender;
            return this;
        }
        public Contact build(){
            return new Contact(this);
        }
    }
}

