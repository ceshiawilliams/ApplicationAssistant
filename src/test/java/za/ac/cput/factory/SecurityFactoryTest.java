package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.security.Security;
import za.ac.cput.factory.security.SecurityFactory;

public class SecurityFactoryTest {

    @Test
    public void createSecurity() {
        Security verification = SecurityFactory.createSecurity("Abdullah", "12ab34cd");

        Assert.assertEquals("Abdullah", verification.getLoginUsername());
        Assert.assertEquals("12ab34cd", verification.getLoginPassword());
    }
}