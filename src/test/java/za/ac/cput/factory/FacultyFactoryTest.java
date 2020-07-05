package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.entity.Faculty;



public class FacultyFactoryTest {

    Faculty faculty = FacultyFactory.getFaculty("1", "Informatics and Design", "Pass Mark: 50%");


    @Before
    public void setUp() {
    }

    @Test
    public void getFaculty() {

        System.out.println(faculty.toString());

        Assert.assertEquals("1", faculty.getFacultyCode());
        Assert.assertEquals("Informatics and Design", faculty.getFacultyName());
        Assert.assertEquals("Pass Mark: 50%", faculty.getFacultyRequirements());

   }
}