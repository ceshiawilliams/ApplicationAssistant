package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.financialAid.Bursary;
import za.ac.cput.entity.financialAid.Funding;
import za.ac.cput.factory.financialAid.BursaryFactory;
import za.ac.cput.factory.financialAid.FundingFactory;


public class FundingFactoryTest {

    @Test
    public void createFunding() {
        Bursary bursary = BursaryFactory.createBursaries("NSFAS", "50% Aggregate");

        Funding funding = FundingFactory.createFunding(bursary);

        Assert.assertEquals("NSFAS", funding.getBursaryList().get(0).getBursaryName());
        Assert.assertEquals("50% Aggregate", funding.getBursaryList().get(0).getBursaryRequirements());


    }
}