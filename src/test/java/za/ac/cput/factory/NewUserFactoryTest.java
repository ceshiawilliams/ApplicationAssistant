package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.NewUser;

import static org.junit.Assert.*;

public class NewUserFactoryTest {

    @Test
    public void createNewUser() {
        NewUser registration = NewUserFactory.createNewUser("Steven", "steven@gmail.com", "stev1357", "steven@gmail.com", "stev1357");

        Assert.assertEquals("Steven", registration.getNewUsername());
        Assert.assertEquals("steven@gmail.com", registration.getNewUserEmail());
        Assert.assertEquals("stev1357", registration.getNewPassword());
        Assert.assertEquals("steven@gmail.com", registration.getConfirmEmail());
        Assert.assertEquals("stev1357", registration.getConfirmPassword());
    }
}