package za.ac.cput.repository.security;

import za.ac.cput.entity.security.Security;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface SecurityRepository extends IRepository<Security, String> {
    Set<Security> getAll();
}
