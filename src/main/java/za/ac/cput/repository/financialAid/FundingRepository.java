package za.ac.cput.repository.financialAid;

import za.ac.cput.entity.financialAid.Funding;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface FundingRepository extends IRepository<Funding, String>
{
    Set<Funding> getAll();
}
