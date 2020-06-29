package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.Security;

import static org.junit.Assert.*;

public class SecurityFactoryTest {

    @Test
    public void createSecurity() {
        Security verification = SecurityFactory.createSecurity("Abdullah", "12ab34cd");

        Assert.assertEquals("Abdullah", verification.getLoginUsername());
        Assert.assertEquals("12ab34cd", verification.getLoginPassword());
    }
}