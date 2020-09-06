package za.ac.cput.service.security.impl;

import za.ac.cput.entity.security.Security;
import za.ac.cput.repository.security.SecurityRepository;
import za.ac.cput.repository.security.impl.SecurityRepositoryImpl;
import za.ac.cput.service.security.SecurityService;

import java.util.HashSet;
import java.util.Set;


public class SecurityServiceImpl implements SecurityService {


    private static SecurityService service  = null;
    private SecurityRepository repository;

    public SecurityServiceImpl( ) {
        this.repository = SecurityRepositoryImpl.getRepository();
    }

    public static SecurityService getService (){

        if (service == null) service = new SecurityServiceImpl();

        return service;

    }


    @Override
    public Set<Security> getAll() {

        return this.repository.getAll();
    }

    @Override
    public Set<Security> getAllStartingWithA() {
        Set<Security> secure = getAll();
        Set<Security> secureWithA = new HashSet<>();

        for (Security security: secure){
            if (security.getLoginUsername().trim().toLowerCase().startsWith("a")){
                secureWithA.add(security);
            }
        }
        return secureWithA;
    }

    @Override
    public Security create(Security security) {
        return this.repository.create(security);
    }

    @Override
    public Security read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Security update(Security security) {
        return this.repository.update(security);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}
