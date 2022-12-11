package fr.efrei.domain;

public class Identity {
    private String passport;
    private int idNo;

    public Identity(Builder builder) {
        this.passport = builder.passport;
        this.idNo = builder.idNo;
    }

    public String getPassport() {
        return passport;
    }



    public int getIdNo() {
        return idNo;
    }

    @Override
    public String toString() {
        return "id_passport='" + passport + '\'' +
                ", id_No=" + idNo +
                '}';
    }
    public static class Builder{
        private String passport;
        private int idNo;

        public Builder setPassport(String passport) {
            this.passport = passport;
            return this;
        }

        public Builder setIdNo(int idNo) {
            this.idNo = idNo;
            return this;
        }
        public Builder copy (Identity id){
            this.passport = id.passport;
            this.idNo = id.idNo;
            return this;
        }
        public Identity build(){
            return new Identity(this);
        }
    }
}
