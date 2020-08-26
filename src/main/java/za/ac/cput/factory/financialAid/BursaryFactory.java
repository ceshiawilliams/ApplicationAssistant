package za.ac.cput.factory.financialAid;

import za.ac.cput.entity.financialAid.Bursary;

public class BursaryFactory {

    public static Bursary createBursaries(String bursaryName, String bursaryRequirements)
    {
        Bursary bursary = new Bursary.Builder()
                .setBursaryName(bursaryName)
                .setBursaryRequirements(bursaryRequirements)
                .build();
        return bursary;
    }
}
