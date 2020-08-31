package za.ac.cput.factory.financialAid;

import za.ac.cput.entity.financialAid.Funding;

public class FundingFactory {

    public static Funding createFunding(String fundingName, String fundingRequirements)
    {
        Funding funding = new Funding.Builder()
                .setFundingName(fundingName)
                .setFundingRequirements(fundingRequirements)
                .build();
        return funding;
    }
}
