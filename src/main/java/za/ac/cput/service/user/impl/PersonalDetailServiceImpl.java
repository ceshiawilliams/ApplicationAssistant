package za.ac.cput.service.user.impl;

import za.ac.cput.entity.user.PersonalDetail;
import za.ac.cput.repository.user.PersonalDetailRepository;
import za.ac.cput.repository.user.impl.PersonalDetailRepositoryImpl;
import za.ac.cput.service.tertiaryInstitution.CourseService;
import za.ac.cput.service.user.PersonalDetailService;

import java.util.HashSet;
import java.util.Set;

public class PersonalDetailServiceImpl implements PersonalDetailService {

    private static PersonalDetailService service = null;
    private PersonalDetailRepository repository;

    private PersonalDetailServiceImpl()
    {
        this.repository = PersonalDetailRepositoryImpl.getRepository();
    }

    public static PersonalDetailService getService()
    {
        if(service == null)
        {
            service = new PersonalDetailServiceImpl();
        }
        return service;
    }

    @Override
    public Set<PersonalDetail> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Set<PersonalDetail> getAllStartingWith076() {
        Set<PersonalDetail> personalDetails = getAll();
        Set<PersonalDetail> personalDetailsWith076 = new HashSet<>();
        for (PersonalDetail personalDetail : personalDetails) {
            if (personalDetail.getContactCellNumber().trim().toLowerCase().startsWith(076 + "")) {
                personalDetailsWith076.add(personalDetail);
            }
        }
        return personalDetailsWith076;    }

    @Override
    public PersonalDetail create(PersonalDetail personalDetail) {
        return this.repository.create(personalDetail);
    }

    @Override
    public PersonalDetail read(String id) {
        return this.repository.read(id);
    }

    @Override
    public PersonalDetail update(PersonalDetail personalDetail) {
        return this.repository.update(personalDetail);
    }

    @Override
    public boolean delete(String id) {
        return this.repository.delete(id);
    }
}
