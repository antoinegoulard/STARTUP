package fr.efrei.domain;

public class Contact {
    private int cellPhoneNo;
    private String email;
    private int homeNo;

    public Contact(int cellPhoneNo, String email, int homeNo) {
        this.cellPhoneNo = cellPhoneNo;
        this.email = email;
        this.homeNo = homeNo;
    }

    public int getCellPhoneNo() {
        return cellPhoneNo;
    }

    public String getEmail() {
        return email;
    }

    public int getHomeNo() {
        return homeNo;
    }

}
