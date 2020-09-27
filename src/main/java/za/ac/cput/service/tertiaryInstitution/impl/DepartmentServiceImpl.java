package za.ac.cput.service.tertiaryInstitution.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.tertiaryInstitution.Department;
import za.ac.cput.repository.tertiaryInstitution.DepartmentRepository;
import za.ac.cput.repository.tertiaryInstitution.impl.DepartmentRepositoryImpl;
import za.ac.cput.service.tertiaryInstitution.DepartmentService;

import java.util.HashSet;
import java.util.Set;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private static DepartmentService service = null;
    private DepartmentRepository repository;

    private DepartmentServiceImpl(){
        this.repository = DepartmentRepositoryImpl.getRepository();
    }

    public static DepartmentService getService() {
        if (service == null)
        {
            service = new DepartmentServiceImpl();
        }
        return service;
    }

    @Override
    public Set<Department> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Set<Department> getAllStartingWith(String letter) {
        Set<Department> departmentSet = getAll();
        Set<Department> departmentsStartingWith = new HashSet<>();
        for(Department department : departmentSet){
            if(department.getDepartmentName().trim().toLowerCase().startsWith(letter))
            {
                departmentsStartingWith.add(department);
            }
        }
        return departmentsStartingWith;
    }

    @Override
    public Department create(Department department) {
        return this.repository.create(department);
    }

    @Override
    public Department read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Department update(Department department) {
        return this.repository.update(department);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}
