package za.ac.cput.service.previousQualification;


import za.ac.cput.entity.previousQualification.Subject;
import za.ac.cput.service.IService;

import java.util.*;

public interface SubjectService extends IService<Subject, String> {

    Set<Subject> getAll();
    Set<Subject> getAllStartingWith(String letter);
}
