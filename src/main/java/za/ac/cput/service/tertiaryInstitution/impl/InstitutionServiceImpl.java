package za.ac.cput.service.tertiaryInstitution.impl;


import org.springframework.stereotype.Service;
import za.ac.cput.entity.tertiaryInstitution.Institution;
import za.ac.cput.repository.tertiaryInstitution.InstitutionRepository;
import za.ac.cput.repository.tertiaryInstitution.impl.InstitutionRepositoryImpl;
import za.ac.cput.service.tertiaryInstitution.InstitutionService;

import java.util.HashSet;
import java.util.Set;
@Service
public class InstitutionServiceImpl implements InstitutionService {

    private static InstitutionService service = null;
    private InstitutionRepository repository;

    private InstitutionServiceImpl(){
        this.repository = InstitutionRepositoryImpl.getRepository();
    }

    public static InstitutionService getService() {
        if (service == null) service = new InstitutionServiceImpl();

        return service;
    }


    @Override
    public Set<Institution> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Set<Institution> getAllStartingWith(String letter) {
        Set<Institution> institutionSet = getAll();
        Set<Institution> institutionsStartingWith = new HashSet<>();
        for(Institution institution : institutionSet){
            if(institution.getInstitutionName().trim().toLowerCase().startsWith(letter))
            {
                institutionsStartingWith.add(institution);
            }
        }
        return institutionsStartingWith;
    }

    @Override
    public Institution create(Institution institution) {
        return this.repository.create(institution);
    }

    @Override
    public Institution read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Institution update(Institution institution) {
        return this.repository.update(institution);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}