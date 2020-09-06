package za.ac.cput.service.previousQualification.impl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.entity.previousQualification.Qualification;
import za.ac.cput.factory.previousQualification.QualificationFactory;
import za.ac.cput.service.previousQualification.QualificationService;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class QualificationServiceImplTest {

    private static QualificationService service = QualificationServiceImpl.getService();
    private static Qualification qualification = QualificationFactory.createQualification("Degree", 3);

    @Test
    public void d_getAll() {

        Set<Qualification> qualifications = service.getAll();
        assertEquals(1, qualifications.size());
        System.out.println("All Qualifications:"+ qualifications);

    }

    @Test
    public void a_create() {
        Qualification created  = service.create(qualification);
        assertEquals(qualification.getQualificationId(), created.getQualificationId());
        assertEquals(qualification.getLevelOfQualifications(), created.getLevelOfQualifications());
        assertEquals(qualification.getNumberOfSubjects(), created.getNumberOfSubjects());
        System.out.println("Created:"+ created);
    }

    @Test
    public void b_read() {
        Qualification read = service.read(qualification.getQualificationId());
        System.out.println("Read:" + read);
    }

    @Test
    public void c_update() {
        Qualification updated = new Qualification.Builder().copy(qualification).setQualificationId("").build();
        updated =service.update(updated);
        System.out.println("updated:" + updated);
    }

    @Test
    public void f_delete() {
        boolean deleted = service.delete(qualification.getQualificationId());
        Assert.assertTrue(deleted);


    }

    @Test
    public void e_getAllStartingWithD() {

        Set<Qualification> secureWithD = service.getAllStartingWithD();
        assertEquals(1,secureWithD.size());
        System.out.println("All secure" + secureWithD);
    }
}