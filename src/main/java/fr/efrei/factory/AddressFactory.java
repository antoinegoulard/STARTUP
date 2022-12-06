package fr.efrei.factory;

import fr.efrei.domain.Address;
import fr.efrei.util.Helper;

public class AddressFactory {
    public static Address createAddress(String street_adress, String postal_address) {
        if(Helper.isNullOrEmpty(street_adress) || Helper.isNullOrEmpty(postal_address))
            return null;

        Address.adress = new Address.Builder().setStreet_address(street_adress)
                .setPostal_address(postal_address)
                .build();
        return address;
    }
}
