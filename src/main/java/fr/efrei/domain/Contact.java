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

    public void setCellPhoneNo(int cellPhoneNo) {
        this.cellPhoneNo = cellPhoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(int homeNo) {
        this.homeNo = homeNo;
    }
}
