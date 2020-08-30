package za.ac.cput.repository.previousQualification.impl;


import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.entity.previousQualification.Qualification;
import za.ac.cput.factory.previousQualification.QualificationFactory;
import za.ac.cput.repository.previousQualification.QualificationRepository;

//import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class QualificationRepositoryImplTest {

    private static QualificationRepository repository = QualificationRepositoryImpl.getRepository();
    private static Qualification qualification = QualificationFactory.createQualification("Tertiary", 4);

    @Test
    public void d_getAll() { System.out.println("Get All"+ repository.getAll());
    }

    @Test
    public void a_create() {

        Qualification created = repository.create(qualification);
        Assert.assertEquals(qualification.getLevelOfQualifications(), created.getLevelOfQualifications());
        Assert.assertEquals(qualification.getNumberOfSubjects(), created.getNumberOfSubjects());
        System.out.println("Created" + created);

    }

    @Test
    public void b_read() {

        Qualification read  = repository.read(qualification.getLevelOfQualifications());
        System.out.println("Read" + read);
    }

    @Test
    public void c_update() {
        Qualification updated = new Qualification.Builder().copy(qualification).setLevelOfQualifications("Tertiary").build();
        updated =repository.update(updated);
        System.out.println("Updated:" + updated);
    }

    @Test
    public void e_delete() {

        boolean deleted = repository.delete(qualification.getLevelOfQualifications());
        Assert.assertTrue(deleted);
    }
}