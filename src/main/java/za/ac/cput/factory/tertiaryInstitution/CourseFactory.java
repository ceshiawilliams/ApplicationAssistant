package za.ac.cput.factory.tertiaryInstitution;

import za.ac.cput.entity.tertiaryInstitution.Course;
import za.ac.cput.util.GenericHelper;
import za.ac.cput.util.StringHelper;


public class CourseFactory {

    public static Course createCourse(String courseName, String courseCode, String courseFees)
    {
        if (StringHelper.isNullorEmpty(courseName)) return new Course.Builder().build();
        String courseId = GenericHelper.generateRandom();
        //Set<Subject> courseRequirement = SubjectRepositoryImpl.getRepository().getAll();
        Course course = new Course.Builder()
                .setCourseId(courseId)
                .setCourseName(courseName)
                .setCourseCode(courseCode)
                //.setCourseRequirement(courseRequirement)
                .setCourseFees(courseFees)
                .build();
        return course;
    }
}
