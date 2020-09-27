package za.ac.cput.repository.previousQualification;


import za.ac.cput.entity.previousQualification.Subject;
import za.ac.cput.repository.IRepository;


import java.util.Set;

public interface SubjectRepository extends IRepository<Subject, String> {
    Set<Subject> getAll();
    void clearAll();
}
