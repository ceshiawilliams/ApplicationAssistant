package za.ac.cput.repository.previousQualification;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.previousQualification.Qualification;



import java.util.Set;

@Repository
public interface QualificationRepository extends JpaRepository<Qualification, String> {

}
