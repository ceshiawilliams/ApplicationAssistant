package za.ac.cput.repository.financialAid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.financialAid.Funding;
import za.ac.cput.repository.IRepository;

import java.util.Set;
@Repository
public interface FundingRepository extends JpaRepository<Funding, String>
{
}
