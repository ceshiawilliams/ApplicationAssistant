package za.ac.cput.factory.previousQualification;

import za.ac.cput.entity.previousQualification.Qualification;
import za.ac.cput.entity.previousQualification.Subject;
import za.ac.cput.repository.previousQualification.impl.SubjectRepositoryImpl;
import za.ac.cput.util.GenericHelper;
import za.ac.cput.util.StringHelper;

import java.util.Set;

public class QualificationFactory {

    public static Qualification createQualification(String levelOfQualifications){
        if (StringHelper.isNullorEmpty(levelOfQualifications)) return new Qualification.Builder().build();
        String qualificationId = GenericHelper.generateRandom();
        //Set<Subject> subjectList = SubjectRepositoryImpl.getRepository().getAll();
        Qualification qualification = new Qualification.Builder()
                .setQualificationId(qualificationId)
                .setLevelOfQualifications(levelOfQualifications)
                //.setSubjectList(subjectList)
                .build();

        return  qualification;
    }
}
