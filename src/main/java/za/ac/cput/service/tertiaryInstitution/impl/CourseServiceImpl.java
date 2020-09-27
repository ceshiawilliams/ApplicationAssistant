package za.ac.cput.service.tertiaryInstitution.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.tertiaryInstitution.Course;
import za.ac.cput.repository.tertiaryInstitution.CourseRepository;
import za.ac.cput.repository.tertiaryInstitution.impl.CourseRepositoryImpl;
import za.ac.cput.service.tertiaryInstitution.CourseService;

import java.util.HashSet;
import java.util.Set;

@Service
public class CourseServiceImpl implements CourseService {

    private static CourseService service = null;
    private CourseRepository repository;

    private CourseServiceImpl()
    {
        this.repository = CourseRepositoryImpl.getRepository();
    }

    public static CourseService getService()
    {
        if(service == null)
        {
            service = new CourseServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Course> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Set<Course> getAllStartingWith(String letter) {
        Set<Course> courses = getAll();
        Set<Course> coursesWith = new HashSet<>();
        for (Course course : courses) {
            if (course.getCourseName().trim().toLowerCase().startsWith(letter)) {
                coursesWith.add(course);
            }
        }
        return coursesWith;
    }

    @Override
    public Course create(Course course) {
        return this.repository.create(course);
    }

    @Override
    public Course read(String id) {
        return this.repository.read(id);
    }

    @Override
    public Course update(Course course) {
        return this.repository.update(course);
    }

    @Override
    public boolean delete(String id) {
        return this.repository.delete(id);
    }
}
