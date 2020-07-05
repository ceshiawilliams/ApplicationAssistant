package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.Bursaries;
import za.ac.cput.entity.Funding;

import java.util.ArrayList;



public class FundingFactoryTest {


    private ArrayList<Funding> bursaryList;


    Funding funding = FundingFactory.createFunding(bursaryList);



    @Test
    public void createFunding() {

        Bursaries bursary = BursariesFactory.createBursaries("NSFAS", "50% Aggregate");
        Assert.assertEquals("NSFAS", bursary.getBursaryName());
        Assert.assertEquals("50% Aggregate", bursary.getBursaryRequirements());


    }
}