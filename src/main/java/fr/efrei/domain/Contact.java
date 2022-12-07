package fr.efrei.domain;

public class Contact {
    private int cellPhoneNo;
    private String email;
    private int homeNo;

    public Contact(Builder builder) {
        this.cellPhoneNo = builder.cellPhoneNo;
        this.email = builder.email;
        this.homeNo = builder.homeNo;
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


    public static class Builder {
        private int cellPhoneNo;
        private String email;
        private int homeNo;

        public Builder setCellPhoneNo(int cellPhoneNo) {
            this.cellPhoneNo = cellPhoneNo;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setHomeNo(int homeNo) {
            this.homeNo = homeNo;
            return this;
        }
        private Builder copy(Contact cnt){
            this.homeNo = cnt.homeNo;
            this.email = cnt.email;
            this.cellPhoneNo = cnt.cellPhoneNo;
            return this;
        }
        public Contact build(){
            return new Contact(this);
        }
    }
}
