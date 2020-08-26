package za.ac.cput.factory.tertiaryInstitution;


import za.ac.cput.entity.tertiaryInstitution.Course;

public class CourseFactory {

    public static Course createCourse(String courseName, String courseCode)
    {
        Course course = new Course.Builder()
                .setCourseName(courseName)
                .setCourseCode(courseCode)
                .build();
        return course;
    }
}
