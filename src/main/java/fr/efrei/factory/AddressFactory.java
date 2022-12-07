package fr.efrei.factory;

import fr.efrei.domain.Address;
import fr.efrei.util.Helper;

public class AddressFactory {
    public static Address createAddress(String street_address, String postal_address) {
        if(Helper.isNullOrEmpty(street_address)|| Helper.isNullOrEmpty(postal_address)) {
            return null;
        }

        Address address = new Address.Builder().setStreet_address(street_address).setPostal_address(postal_address).build();
        return address;
    }
}
