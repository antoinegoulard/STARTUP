package fr.efrei.domain;

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
    public String getPostal_address() {
        return postal_address;
    }

    public Builder setStreet_address(String street_address) {
        this.street_address = street_address;
        return this;
    }
    public Builder setPostal_address(String postal_address) {
        this.postal_address = postal_address;
        return this;
    }


    @Override
    public String toString() {
        return "Address{" +
                "street_address='" + street_address + '\'' +
                ", postal_address='" + postal_address + '\'' +
                '}';
    }

    private Builder copy(Address address) {
        this.street_address = address.street_address;
        this.postal_address = address.postal_address;
        return this;
    }

    public Address build() {
        return new Address(this);
    }
}

