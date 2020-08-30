package za.ac.cput.repository.tertiaryInstitution.impl;

import za.ac.cput.entity.tertiaryInstitution.Institution;
import za.ac.cput.repository.tertiaryInstitution.InstitutionRepository;

import java.util.HashSet;
import java.util.Set;

public class InstitutionRepositoryImpl implements InstitutionRepository {

    private static InstitutionRepository repository = null;
    private Set<Institution> institutionSet;

    private InstitutionRepositoryImpl()
    {
        this.institutionSet = new HashSet<>();
    }

    public static InstitutionRepository getRepository()
    {
        if(repository == null)
        {
            repository = new InstitutionRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Set<Institution> getAll() {
        return this.institutionSet;
    }

    @Override
    public Institution create(Institution institution)
    {
        this.institutionSet.add(institution);
        return institution;
    }

    @Override
    public Institution read(String institutionCode)
    {
        for(Institution institution : this.institutionSet)
        {
            if(institution.getInstitutionCode().equalsIgnoreCase(institutionCode))
            {
                return institution;
            }
        }
        return null;
    }

    @Override
    public Institution update(Institution institution)
    {
        boolean deleteInstitution = delete(institution.getInstitutionCode());
        if(deleteInstitution)
        {
            this.institutionSet.add(institution);
            return institution;
        }
        return null;
    }

    @Override
    public boolean delete(String institutionCode)
    {
        Institution institution = read(institutionCode);
        if(institution != null)
        {
            this.institutionSet.remove(institution);
            return true;
        }
        return false;
    }
}
