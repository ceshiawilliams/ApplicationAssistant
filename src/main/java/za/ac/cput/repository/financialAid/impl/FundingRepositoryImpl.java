package za.ac.cput.repository.financialAid.impl;

import za.ac.cput.entity.financialAid.Funding;
import za.ac.cput.repository.financialAid.FundingRepository;

import java.util.HashSet;
import java.util.Set;

public class FundingRepositoryImpl implements FundingRepository {

    private static FundingRepository repository = null;
    private Set<Funding> fundingDB;

    private FundingRepositoryImpl() { this.fundingDB = new HashSet<>(); }

    public static FundingRepository getRepository() {
        if(repository == null) repository = new FundingRepositoryImpl();
        return repository;
    }


    @Override
    public Set<Funding> getAll() {
        return this.fundingDB;
    }

    @Override
    public Funding create(Funding funding) {
        this.fundingDB.add(funding);
        return funding;
    }

    @Override
    public Funding read(String fundingName) {
        for (Funding funding : this.fundingDB)
        {
            if (funding.getFundingName().equalsIgnoreCase(fundingName)) return funding;
        }
        return null;
    }

    @Override
    public Funding update(Funding funding) {
        boolean deleteFunding = delete(funding.getFundingName());
        if (deleteFunding)
        {
            this.fundingDB.add(funding);
            return funding;
        }
        return null;
    }

    @Override
    public boolean delete(String fundingName) {
        Funding funding = read(fundingName);
        if (funding != null)
        {
            this.fundingDB.remove(funding);
            return true;
        }
        return false;
    }
}
