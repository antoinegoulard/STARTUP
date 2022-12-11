package fr.efrei.factory;

import fr.efrei.domain.Job;
import fr.efrei.util.Helper;

public class JobFactory {
    public static Job createJob(String title,String positionCod, boolean statue){
        if (Helper.isNullOrEmpty(title)||Helper.isNullOrEmpty(positionCod) || statue){
            return null;
        }


        Job job = new Job.Builder().setTitle(title).setPositionCode(positionCod).setStatue(statue).build();
        return job;

    }

}
