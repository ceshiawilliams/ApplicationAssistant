package za.ac.cput.repository.user.impl;


import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.entity.user.PersonalDetail;
import za.ac.cput.factory.user.PersonalDetailFactory;
import za.ac.cput.repository.user.impl.impl.PersonalDetailRepositoryImpl;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonalDetailRepositoryImplTest {

    private static PersonalDetailRepository repository = PersonalDetailRepositoryImpl.getRepository();
    private static PersonalDetail personalDetail = PersonalDetailFactory.createPersonalDetails("ssontshatsha@yahoo.com", "0712345678", "National Diploma");

    @Test
    public void d_getAll()
    {
        System.out.println("Get All: " + repository.getAll());
    }

    @Test
    public void a_create()
    {
        PersonalDetail created = repository.create(personalDetail);
        Assert.assertEquals(personalDetail.getContactEmail(), created.getContactEmail());
        Assert.assertEquals(personalDetail.getContactCellNumber(), created.getContactCellNumber());
        Assert.assertEquals(personalDetail.getQualificationType(),created.getQualificationType());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read()
    {
        PersonalDetail read = repository.read(personalDetail.getContactEmail());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update()
    {
        PersonalDetail updated = new PersonalDetail.Builder().copy(personalDetail).setContactEmail("New Contact Email").build();
        updated = repository.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete()
    {
        boolean deleted = repository.delete(personalDetail.getContactEmail());
        Assert.assertTrue(deleted);
    }
}