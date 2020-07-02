package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.Bursaries;

import static org.junit.Assert.*;

public class BursariesFactoryTest {

    @Test
    public void createBursaries() {
        Bursaries bursary = BursariesFactory.createBursaries("NSFAS", "50% Aggregate");

        Assert.assertEquals("NSFAS", bursary.getBursaryName());
        Assert.assertEquals("50% Aggregate", bursary.getBursaryRequirements());
    }
}