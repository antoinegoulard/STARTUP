package fr.efrei.factory;

import fr.efrei.domain.DemInfo;
import fr.efrei.util.Helper;

public class DemInfoFactory {
    public static DemInfo createDemInfo(String race, String gender){
        if (Helper.isNullOrEmpty(race)|| Helper.isNullOrEmpty(gender)){
            return null;
        }

        DemInfo di = new DemInfo.Builder().setGender(gender).setRace(race).build();
        return di;
    }
}
