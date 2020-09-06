package za.ac.cput.service.financialAid.impl;

import za.ac.cput.entity.financialAid.Funding;
import za.ac.cput.repository.financialAid.FundingRepository;
import za.ac.cput.repository.financialAid.impl.FundingRepositoryImpl;
import za.ac.cput.service.financialAid.FundingService;

import java.util.*;

public class FundingServiceImpl implements FundingService {

    private static FundingService service = null;
    private FundingRepository repository;

    private FundingServiceImpl() {
        this.repository = FundingRepositoryImpl.getRepository();
    }

    public static FundingService getService() {
        if(service == null) service = new FundingServiceImpl();
        return service;
    }

    @Override
    public Set<Funding> getAll() {
        return this.repository.getAll();
    }


   @Override
    public Set<Funding> getAllStartingWith(String letter) {
        Set<Funding> fundings = getAll();
        Set<Funding>  fundingsWith = new HashSet<>();
        for (Funding funding : fundings) {
            if (funding.getFundingName().trim().toLowerCase().startsWith(letter)) ;{
                fundingsWith.add(funding);
            }

        }
        return fundingsWith;
    }

    @Override
    public Funding create(Funding funding) {
        return this.repository.create(funding);
    }

    @Override
    public Funding read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Funding update(Funding funding) {
        return this.repository.update(funding);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}
