package za.ac.cput.factory;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.Qualification;

public class QualificationFactoryTest {

    @Test
    public void createQualification(){
        Qualification qualification = QualificationFactory.createQualification("National Senior Certificate", 7);

        Assert.assertEquals("National Senior Certificate", qualification.getLevelOfQualifications());
        Assert.assertEquals(7, qualification.getNumberOfSubjects());
    }
}