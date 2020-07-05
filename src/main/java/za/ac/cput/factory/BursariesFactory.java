package za.ac.cput.factory;

import za.ac.cput.entity.Bursaries;

public class BursariesFactory {

    public static Bursaries createBursaries(String bursaryName, String bursaryRequirements)
    {
        Bursaries bursary = new Bursaries.Builder()
                .setBursaryName(bursaryName)
                .setBursaryRequirements(bursaryRequirements)
                .build();
        return bursary;
    }
}
