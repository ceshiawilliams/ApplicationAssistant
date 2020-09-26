package za.ac.cput.service.previousQualification;

import za.ac.cput.entity.previousQualification.Qualification;
import za.ac.cput.entity.tertiaryInstitution.Course;
import za.ac.cput.service.IService;

import java.util.ArrayList;
import java.util.Set;

public interface QualificationService extends IService <Qualification, String> {

    Set<Qualification> getAll();

    Set<Qualification> getAllStartingWithD();

    ArrayList<Course> checkIfQualifies(Qualification qualification, Set<Course> courseList);

}
