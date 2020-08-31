package za.ac.cput.repository.user.impl;


import za.ac.cput.entity.user.PersonalDetail;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface PersonalDetailRepository extends IRepository<PersonalDetail, String> {
    Set<PersonalDetail> getAll();
}
