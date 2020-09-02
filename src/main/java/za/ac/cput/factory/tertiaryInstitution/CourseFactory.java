package za.ac.cput.factory.tertiaryInstitution;


import za.ac.cput.entity.tertiaryInstitution.Course;
import za.ac.cput.util.GenericHelper;
import za.ac.cput.util.StringHelper;

public class CourseFactory {

    public static Course createCourse(String courseName, String courseCode)
    {
        if (StringHelper.isNullorEmpty(courseName)) return new Course.Builder().build();
        String courseId = GenericHelper.generateRandom();
        Course course = new Course.Builder()
                .setCourseId(courseId)
                .setCourseName(courseName)
                .setCourseCode(courseCode)
                .build();
        return course;
    }
}
