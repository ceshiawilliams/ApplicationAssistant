package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.Faculty;



public class FacultyFactoryTest {

    Faculty faculty = FacultyFactory.createFaculty("1", "Informatics and Design", "Pass Mark: 50%");



    @Test
    public void createFaculty() {


        Assert.assertEquals("1", faculty.getFacultyCode());
        Assert.assertEquals("Informatics and Design", faculty.getFacultyName());
        Assert.assertEquals("Pass Mark: 50%", faculty.getFacultyRequirements());

   }
}