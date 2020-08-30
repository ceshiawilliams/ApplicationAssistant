package za.ac.cput.repository.tertiaryInstitution.impl;

import za.ac.cput.entity.tertiaryInstitution.Course;
import za.ac.cput.repository.tertiaryInstitution.CourseRepository;
import java.util.*;

public class CourseRepositoryImpl implements CourseRepository {

    private static CourseRepository repository = null;
    private Set<Course> courseSet;

    private CourseRepositoryImpl()
    {

        this.courseSet = new HashSet<>();
    }

    public static CourseRepository getRepository()
    {
        if(repository == null)
        {
            repository = new CourseRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Set<Course> getAll()
    {
        return this.courseSet;
    }

    @Override
    public Course create(Course course)
    {
        this.courseSet.add(course);
        return course;
    }

    @Override
    public Course read(String courseName)
    {
        for(Course course : this.courseSet)
        {
            if(course.getCourseName().equalsIgnoreCase(courseName))
            {
                return course;
            }
        }
        return null;
    }

    @Override
    public Course update(Course course)
    {
        boolean deleteCourse = delete(course.getCourseName());
        if(deleteCourse)
        {
            this.courseSet.add(course);
            return course;
        }
        return null;
    }
    @Override
    public boolean delete(String courseCode)
    {
        Course course = read(courseCode);
        if(course != null)
        {
            this.courseSet.remove(course);
            return true;
        }
        return false;
    }
}


