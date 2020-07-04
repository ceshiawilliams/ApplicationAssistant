package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.Course;

import static org.junit.Assert.*;

public class CourseFactoryTest {

    @Test
    public void createCourse() {
        Course course = CourseFactory.createCourse("Information Technology", "ICT362S");

        Assert.assertEquals("Information Technology", course.getCourseName());
        Assert.assertEquals("ICT362S", course.getCourseCode());
    }
}