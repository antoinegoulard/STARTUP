package fr.efrei.factory;

import fr.efrei.domain.Identity;
import fr.efrei.util.Helper;

public class IdentityFactory {
    public static Identity createIdentity( String passport,int idNo ){
        if (Helper.isNullOrEmpty(passport) || Helper.isNullOrEmpty(idNo)){
            return null;
        }
        Identity id = new Identity.Builder().setIdNo(idNo).setPassport(passport).build();
        return id;
    }
}
