package za.ac.cput.service.security.impl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.entity.security.Security;
import za.ac.cput.factory.security.SecurityFactory;
import za.ac.cput.service.security.SecurityService;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class SecurityServiceImplTest {

    private static SecurityService service = SecurityServiceImpl.getService();
    private static Security  security = SecurityFactory.createSecurity("Armel", "4321");

    @Test
    public void d_getAll() {

        Set<Security> secure = service.getAll();
        assertEquals(1,secure.size());
        System.out.println("All secure" + secure);

    }

    @Test
    public void a_create() {

        Security created  = service.create(security);
        Assert.assertEquals(security.getSecurityId(), created.getSecurityId());
        System.out.println("Created:" + created);
    }

    @Test
    public void b_read() {

        Security read = service.read(security.getSecurityId());
        System.out.println("Read:" + read);


    }

    @Test
    public void c_update() {
        //check here method setSecurityId
        Security updated = new Security.Builder().copy(security).setSecurityId("").build();
        updated = service.update(updated);
        System.out.println("Updated:"+ updated);
    }

    @Test
    public void e_delete() {

        boolean deleted = service.delete(security.getSecurityId());
        Assert.assertTrue(deleted);

    }
}