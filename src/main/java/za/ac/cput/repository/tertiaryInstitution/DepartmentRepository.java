package za.ac.cput.repository.tertiaryInstitution;

import za.ac.cput.entity.tertiaryInstitution.Department;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface DepartmentRepository extends IRepository<Department, String> {
    Set<Department> getAll();
}
