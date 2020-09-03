package za.ac.cput.repository.security.impl;

import za.ac.cput.entity.security.Security;
import za.ac.cput.repository.security.SecurityRepository;

import java.util.HashSet;
import java.util.Set;

public class SecurityRepositoryImpl implements SecurityRepository {

    private static SecurityRepository repository = null;
    private Set<Security> securitySet;

    private SecurityRepositoryImpl()
    {
        this.securitySet = new HashSet<>();
    }

    public static SecurityRepository getRepository()
    {
        if(repository == null)
        {
            repository = new SecurityRepositoryImpl();
        }
        return repository;
    }


    @Override
    public Set<Security> getAll()
    {
        return this.securitySet;
    }

    @Override
    public Security create(Security security)
    {
        this.securitySet.add(security);
        return security;
    }

    @Override
    public Security read(String securityId)
    {
        for(Security security : this.securitySet)
        {
            if(security.getSecurityId().equalsIgnoreCase(securityId))
            {
                return security;
            }
        }
        return null;
    }

    @Override
    public Security update(Security security)
    {
        boolean deleteSecurity = delete(security.getSecurityId());
        if(deleteSecurity)
        {
            this.securitySet.add(security);
            return security;
        }
        return null;
    }

    @Override
    public boolean delete(String securityId)
    {
        Security security = read(securityId);
        if(security != null)
        {
            this.securitySet.remove(security);
            return true;
        }
        return false;
    }
}
