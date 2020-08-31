package za.ac.cput.repository.tertiaryInstitution.impl;

import za.ac.cput.entity.tertiaryInstitution.Department;
import za.ac.cput.repository.tertiaryInstitution.DepartmentRepository;

import java.util.HashSet;
import java.util.Set;

public class DepartmentRepositoryImpl implements DepartmentRepository {

    private static DepartmentRepository repository = null;
    private Set<Department> departmentSet;

    private DepartmentRepositoryImpl()
    {
        this.departmentSet = new HashSet<>();
    }

    public static DepartmentRepository getRepository()
    {
        if(repository == null)
        {
            repository = new DepartmentRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Set<Department> getAll() {
        return this.departmentSet;
    }

    @Override
    public Department create(Department department)
    {
        this.departmentSet.add(department);
        return department;
    }

    @Override
    public Department read(String departmentCode)
    {
        for(Department department : this.departmentSet)
        {
            if(department.getDepartmentCode().equalsIgnoreCase(departmentCode))
            {
                return department;
            }
        }
        return null;
    }

    @Override
    public Department update(Department department)
    {
        boolean deleteDepartment = delete(department.getDepartmentCode());
        if(deleteDepartment)
        {
            this.departmentSet.add(department);
            return department;
        }
        return null;
    }

    @Override
    public boolean delete(String departmentCode)
    {
        Department department = read(departmentCode);
        if(department != null)
        {
            this.departmentSet.remove(department);
            return true;
        }
        return false;
    }
}
