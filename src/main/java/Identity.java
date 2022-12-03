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

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }
}
