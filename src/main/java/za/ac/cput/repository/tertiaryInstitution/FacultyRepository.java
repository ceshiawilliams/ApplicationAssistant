package za.ac.cput.repository.tertiaryInstitution;

import za.ac.cput.entity.tertiaryInstitution.Faculty;
import za.ac.cput.repository.IRepository;
import java.util.*;

public interface FacultyRepository extends IRepository<Faculty, String> {
    Set<Faculty> getAll();
}
