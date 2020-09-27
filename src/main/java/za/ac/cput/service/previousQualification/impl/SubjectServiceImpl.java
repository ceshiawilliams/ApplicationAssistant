package za.ac.cput.service.previousQualification.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.previousQualification.Subject;
import za.ac.cput.repository.previousQualification.SubjectRepository;
import za.ac.cput.repository.previousQualification.impl.SubjectRepositoryImpl;
import za.ac.cput.service.previousQualification.SubjectService;

import java.util.*;

@Service
public class SubjectServiceImpl implements SubjectService {

    private static SubjectService service = null;
    private SubjectRepository repository;

    private SubjectServiceImpl() {
        this.repository = SubjectRepositoryImpl.getRepository();
    }

    public static SubjectService getService() {
        if(service == null) service = new SubjectServiceImpl();
        return service;
    }

    @Override
    public Set<Subject> getAll() {

        return this.repository.getAll();
    }

    @Override
    public Set<Subject> getAllStartingWith(String letter) {
        Set<Subject> subjects = getAll();
        Set<Subject> subjectsWith = new HashSet<>();
        for (Subject subject : subjects) {
            if (subject.getSubjectName().trim().toLowerCase().startsWith(letter)){
                subjectsWith.add(subject);
            }
        }
        return subjectsWith;
    }

    @Override
    public Subject create(Subject subject) {

        return this.repository.create(subject);
    }

    @Override
    public Subject read(String s) {

        return this.repository.read(s);
    }

    @Override
    public Subject update(Subject subject) {

        return this.repository.update(subject);
    }

    @Override
    public boolean delete(String s) {

        return this.repository.delete(s);
    }
}