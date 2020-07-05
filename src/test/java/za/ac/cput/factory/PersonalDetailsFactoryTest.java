package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.PersonalDetails;

import static org.junit.Assert.*;

public class PersonalDetailsFactoryTest {

    @Test
    public void createPersonalDetails() {
        PersonalDetails information = PersonalDetailsFactory.createPersonalDetails("274758381@mycput.ac.za", "0982852948", "application development");

        Assert.assertEquals("274758381@mycput.ac.za", information.getContactEmail());
        Assert.assertEquals("0982852948", information.getContactCellNumber());
        Assert.assertEquals("application development", information.getQualificationType());
    }
}