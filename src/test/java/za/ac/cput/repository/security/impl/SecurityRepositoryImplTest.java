package za.ac.cput.repository.security.impl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.entity.security.Security;
import za.ac.cput.factory.security.SecurityFactory;
import za.ac.cput.repository.security.SecurityRepository;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SecurityRepositoryImplTest {

    private static SecurityRepository repository = SecurityRepositoryImpl.getRepository();
    private static Security security = SecurityFactory.createSecurity("Abdullah", "PassworD");

    @Test
    public void d_getAll()
    {
        System.out.println("Get All: " + repository.getAll());
    }

    @Test
    public void a_create()
    {
        Security created = repository.create(security);
        Assert.assertEquals(security.getLoginUsername(), created.getLoginUsername());
        Assert.assertEquals(security.getLoginPassword(), created.getLoginPassword());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read()
    {
        Security read = repository.read(security.getLoginUsername());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update()
    {
        Security updated = new Security.Builder().copy(security).setLoginPassword("NewPassword").build();
        updated = repository.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete()
    {
        boolean deleted = repository.delete(security.getLoginUsername());
        Assert.assertTrue(deleted);
    }
}