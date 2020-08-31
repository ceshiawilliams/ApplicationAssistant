package za.ac.cput.repository.user.impl;


import za.ac.cput.entity.user.NewUser;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface NewUserRepository extends IRepository<NewUser, String> {
        Set<NewUser> getAll();
}
