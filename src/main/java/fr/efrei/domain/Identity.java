package fr.efrei.domain;

public class Identity {
    private String passport;
    private int idNo;

    public Identity(String passport, int idNo) {
        this.passport = passport;
        this.idNo = idNo;
    }

    public String getPassport() {
        return passport;
    }

    public int getIdNo() {
        return idNo;
    }

}
