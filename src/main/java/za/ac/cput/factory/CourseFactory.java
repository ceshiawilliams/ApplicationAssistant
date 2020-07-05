package za.ac.cput.factory;


import za.ac.cput.entity.Course;

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
