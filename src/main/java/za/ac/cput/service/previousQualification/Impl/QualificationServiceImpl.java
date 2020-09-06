package za.ac.cput.service.previousQualification.Impl;

import za.ac.cput.entity.previousQualification.Qualification;
import za.ac.cput.repository.previousQualification.QualificationRepository;
import za.ac.cput.repository.previousQualification.impl.QualificationRepositoryImpl;
import za.ac.cput.service.previousQualification.QualificationService;

import java.util.Set;

public class QualificationServiceImpl implements QualificationService {

    private static QualificationService service = null;
    private QualificationRepository repository;

    public QualificationServiceImpl(){

        this.repository = QualificationRepositoryImpl.getRepository();
    }

    public static QualificationService getService(){

        if (service == null) service = new QualificationServiceImpl();

        return service;
    }

    @Override
    public Set<Qualification> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Qualification create(Qualification qualification) {
        return this.repository.create(qualification);
    }

    @Override
    public Qualification read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Qualification update(Qualification qualification) {
        return this.repository.update(qualification);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}
