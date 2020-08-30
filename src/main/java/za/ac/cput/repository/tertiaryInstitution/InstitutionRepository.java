package za.ac.cput.repository.tertiaryInstitution;

import za.ac.cput.entity.tertiaryInstitution.Institution;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface InstitutionRepository extends IRepository<Institution, String> {
    Set<Institution> getAll();
}
