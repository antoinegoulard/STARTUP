package fr.efrei.factory;

import fr.efrei.domain.Contact;
import fr.efrei.util.Helper;

public class ContactFactory {
    public static Contact createContact( int cellPhoneNo, String email, int homeNo){
        if (Helper.isNullOrEmpty(cellPhoneNo)|| Helper.isNullOrEmpty(email)||Helper.isNullOrEmpty(homeNo)){
            return null;
        }
        Contact contact = new Contact.Builder().setCellPhoneNo(cellPhoneNo).setEmail(email).setHomeNo(homeNo).build();
        return contact;
    }
}
