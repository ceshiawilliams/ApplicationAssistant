package za.ac.cput.repository.previousQualification;

import za.ac.cput.entity.previousQualification.Qualification;
import za.ac.cput.repository.IRepository;


import java.util.Set;

public interface QualificationRepository extends IRepository<Qualification, String> {

    Set<Qualification> getAll();
}
