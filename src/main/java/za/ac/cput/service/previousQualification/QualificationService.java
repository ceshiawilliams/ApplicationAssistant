package za.ac.cput.service.previousQualification;

import za.ac.cput.entity.previousQualification.Qualification;
import za.ac.cput.service.IService;

import java.util.Set;

public interface QualificationService extends IService <Qualification, String> {

    Set<Qualification> getAll();

}
