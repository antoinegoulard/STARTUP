package fr.efrei.factory;

import fr.efrei.domain.Address;
import fr.efrei.util.Helper;

public class AddressFactory {
    public static Address createAddress(String description) {
        if(Helper.isNullOrEmpty(description))
            return null;

        Address.adress = new Address.Builder().setId(id)
                .setDescription(description)
                .build();
        return address;
    }
}
