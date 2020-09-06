package za.ac.cput.service.tertiaryInstitution.impl;

import za.ac.cput.entity.tertiaryInstitution.Faculty;
import za.ac.cput.repository.tertiaryInstitution.FacultyRepository;
import za.ac.cput.repository.tertiaryInstitution.impl.FacultyRepositoryImpl;
import za.ac.cput.service.tertiaryInstitution.FacultyService;

import java.util.HashSet;
import java.util.Set;

public class FacultyServiceImpl implements FacultyService {
    private static FacultyService service = null;
    private FacultyRepository repository;

    private FacultyServiceImpl()
    {
        this.repository = FacultyRepositoryImpl.getRepository();
    }

    public static FacultyService getService()
    {
        if(service == null)
        {
            service = new FacultyServiceImpl();
        }
        return service;
    }
    @Override
    public Set<Faculty> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Set<Faculty> getAllStartingWith(String letter) {
        Set<Faculty> facultySet = getAll();
        Set<Faculty> facultiesWith = new HashSet<>();
        for(Faculty faculty : facultySet)
        {
            if(faculty.getFacultyName().trim().toLowerCase().startsWith(letter)){
                facultiesWith.add(faculty);
            }
        }
        return facultiesWith;
    }

    @Override
    public Faculty create(Faculty faculty) {
        return this.repository.create(faculty);
    }

    @Override
    public Faculty read(String FacultyId) {
        return this.repository.read(FacultyId);
    }

    @Override
    public Faculty update(Faculty faculty) {
        return this.repository.update(faculty);
    }

    @Override
    public boolean delete(String FacultyId) {
        return this.repository.delete(FacultyId);
    }
}
