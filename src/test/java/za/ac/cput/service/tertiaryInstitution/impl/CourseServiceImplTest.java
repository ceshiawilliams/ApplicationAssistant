package za.ac.cput.service.tertiaryInstitution.impl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.entity.tertiaryInstitution.Course;
import za.ac.cput.factory.tertiaryInstitution.CourseFactory;
import za.ac.cput.service.tertiaryInstitution.CourseService;

import java.util.Set;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CourseServiceImplTest {

    private static CourseService service = CourseServiceImpl.getService();
    private static Course course = CourseFactory.createCourse("ADP", "ADP23");

    @Test
    public void d_getAll() {
        Set<Course> courses = service.getAll();
        assertEquals(1, courses.size());
        System.out.println("All courses: " + courses);
    }



    @Test
    public void a_create() {
        Course created = service.create(course);
        Assert.assertEquals(course.getCourseId(), created.getCourseId());
        Assert.assertEquals(course.getCourseName(), created.getCourseName());
        Assert.assertEquals(course.getCourseCode(), created.getCourseCode());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read() {
        Course read = service.read(course.getCourseId());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        Course updated = new Course.Builder().copy(course).setCourseCode("ADP5678").build();
        updated = service.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void f_delete() {
        boolean deleted = service.delete(course.getCourseId());
        Assert.assertTrue(deleted);
    }

    @Test
    public void e_getAllStartingWith() {
        Set<Course> courses = service.getAllStartingWith("a");
        assertEquals(1, courses.size());
        System.out.println("All courses: " + courses);
    }
}