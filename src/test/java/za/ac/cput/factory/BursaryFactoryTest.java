package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.financialAid.Bursary;
import za.ac.cput.factory.financialAid.BursaryFactory;

public class BursaryFactoryTest {

    @Test
    public void createBursaries() {
        Bursary bursary = BursaryFactory.createBursaries("NSFAS", "50% Aggregate");

        Assert.assertEquals("NSFAS", bursary.getBursaryName());
        Assert.assertEquals("50% Aggregate", bursary.getBursaryRequirements());
    }
}