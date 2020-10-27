package za.ac.cput.service.previousQualification.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.entity.previousQualification.Subject;
import za.ac.cput.repository.previousQualification.SubjectRepository;
import za.ac.cput.service.previousQualification.SubjectService;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository repository;

    @Override
    public Set<Subject> getAll() {

        return this.repository.findAll().stream().collect(Collectors.toSet());
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

        return this.repository.save(subject);
    }

    @Override
    public Subject read(String id) {

        return this.repository.findById(id).orElseGet(null);
    }

    @Override
    public Subject update(Subject subject) {

        return create(subject);
    }

    @Override
    public boolean delete(String id) {
        this.repository.deleteById(id);
        if(this.repository.existsById(id)){
            return false;
        }else{
            return true;
        }
    }
}