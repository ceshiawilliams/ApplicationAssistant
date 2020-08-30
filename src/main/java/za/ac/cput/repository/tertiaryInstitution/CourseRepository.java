package za.ac.cput.repository.tertiaryInstitution;

import za.ac.cput.entity.tertiaryInstitution.Course;
import za.ac.cput.repository.IRepository;
import java.util.*;

public interface CourseRepository extends IRepository<Course, String> {
    Set<Course> getAll();

}
