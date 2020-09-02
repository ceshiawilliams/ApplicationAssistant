package za.ac.cput.repository.user.impl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.entity.user.NewUser;
import za.ac.cput.factory.user.NewUserFactory;
import za.ac.cput.repository.user.impl.impl.NewUserRepositoryImpl;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NewUserRepositoryImplTest {

    private static NewUserRepository repository = NewUserRepositoryImpl.getRepository();
    private static NewUser newUser = NewUserFactory.createNewUser("Sonia_Sontshatsha", "ssontshatsha@yahoo.com", "123", "ssontshatsha@yahoo.com", "123");

    @Test
    public void d_getAll()
    {
        System.out.println("Get All: " + repository.getAll());
    }

    @Test
    public void a_create()
    {
        NewUser created = repository.create(newUser);
        Assert.assertEquals(newUser.getNewUserName(), created.getNewUserName());
        Assert.assertEquals(newUser.getNewUserEmail(), created.getNewUserEmail());
        Assert.assertEquals(newUser.getNewPassword(),created.getNewPassword());
        Assert.assertEquals(newUser.getConfirmEmail(),created.getConfirmEmail());
        Assert.assertEquals(newUser.getConfirmPassword(),created.getConfirmPassword());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read()
    {
        NewUser read = repository.read(newUser.getNewUserId());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update()
    {
        NewUser updated = new NewUser.Builder().copy(newUser).setNewPassword("456").build();
        updated = repository.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete()
    {
        boolean deleted = repository.delete(newUser.getNewUserId());
        Assert.assertTrue(deleted);
    }
}
