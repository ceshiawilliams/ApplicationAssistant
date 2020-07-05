package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.Bursaries;
import za.ac.cput.entity.Funding;

import java.util.ArrayList;



public class FundingFactoryTest {

    @Test
    public void createFunding() {
        Bursaries bursary = BursariesFactory.createBursaries("NSFAS", "50% Aggregate");

        Funding funding = FundingFactory.createFunding(bursary);

        Assert.assertEquals("NSFAS", funding.getBursaryList().get(0).getBursaryName());
        Assert.assertEquals("50% Aggregate", funding.getBursaryList().get(0).getBursaryRequirements());


    }
}