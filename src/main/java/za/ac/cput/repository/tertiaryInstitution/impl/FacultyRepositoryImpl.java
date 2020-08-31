package za.ac.cput.repository.tertiaryInstitution.impl;


import za.ac.cput.entity.tertiaryInstitution.Faculty;
import za.ac.cput.repository.tertiaryInstitution.FacultyRepository;
import java.util.*;

public class FacultyRepositoryImpl implements FacultyRepository {

    private static FacultyRepository repository = null;
    private Set<Faculty> facultySet;

    private FacultyRepositoryImpl()
    {
        this.facultySet = new HashSet<>();
    }

    public static FacultyRepository getRepository()
    {
        if(repository == null)
        {
            repository = new FacultyRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Set<Faculty> getAll()
    {
        return this.facultySet;
    }

    @Override
    public Faculty create(Faculty faculty)
    {
        this.facultySet.add(faculty);
        return faculty;
    }

    @Override
    public Faculty read(String facultyName)
    {
        for(Faculty faculty : this.facultySet)
        {
            if(faculty.getFacultyName().equalsIgnoreCase(facultyName))
            {
                return faculty;
            }
        }
        return null;
    }

    @Override
    public Faculty update(Faculty faculty)
    {
        boolean deleteFaculty = delete(faculty.getFacultyName());
        if(deleteFaculty)
        {
            this.facultySet.add(faculty);
            return faculty;
        }
        return null;
    }

    @Override
    public boolean delete(String facultyName)
    {
        Faculty faculty = read(facultyName);
        if(faculty != null)
        {
            this.facultySet.remove(faculty);
            return true;
        }
        return false;
    }
}

