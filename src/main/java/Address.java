public class Address {

    private String street_address;
    private String postal_address;

    public Address(String street_address, String postal_address) {
        this.street_address = street_address;
        this.postal_address = postal_address;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getPostal_address() {
        return postal_address;
    }

    public void setPostal_address(String postal_address) {
        this.postal_address = postal_address;
    }
}
