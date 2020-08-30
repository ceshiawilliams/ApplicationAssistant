package za.ac.cput.repository.previousQualification.impl;


import za.ac.cput.entity.previousQualification.Subject;
import za.ac.cput.repository.previousQualification.SubjectRepository;

import java.util.Set;

public class SubjectRepositoryImpl implements SubjectRepository {

    private static SubjectRepository repository = null;
    private Set<Subject>subjectSet;

    public static SubjectRepository getRepository()
    {
        if (repository == null)
        {
            repository = new SubjectRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Set<Subject> getAll() {
        return this.subjectSet;
    }

    @Override
    public Subject create(Subject subject) {
       this.subjectSet.add(subject);
       return subject;
    }

    @Override
    public Subject read(String s)
    {
        for (Subject subject: this.subjectSet)
        {
            if (subject.getSubjectName().equalsIgnoreCase(s))
            {
                return subject;
            }
        }
        return  null;
    }

    @Override
    public Subject update(Subject subject) {

        boolean deleteSubject = delete(subject.getSubjectName());

        if(deleteSubject)
        {
            this.subjectSet.add(subject);
            return subject;
        }

        return null;
    }

    @Override
    public boolean delete(String s) {
        Subject  subject = read(s);
        if(subject!=null)
        {
            this.subjectSet.remove(subject);
            return true;
        }

        return false;
    }
}
