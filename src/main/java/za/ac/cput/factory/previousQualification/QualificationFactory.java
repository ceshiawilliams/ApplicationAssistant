package za.ac.cput.factory.previousQualification;

import za.ac.cput.entity.previousQualification.Qualification;
import za.ac.cput.util.GenericHelper;
import za.ac.cput.util.StringHelper;

public class QualificationFactory {

    public static Qualification createQualification(String levelOfQualifications, int numberOfSubjects){
        if (StringHelper.isNullorEmpty(levelOfQualifications)) return new Qualification.Builder().build();
        if (StringHelper.isNullorEmpty(numberOfSubjects + "")) return new Qualification.Builder().build();//check if this works or not
        String qualificationId = GenericHelper.generateRandom();
        Qualification qualification = new Qualification.Builder()
                .setQualificationId(qualificationId)
                .setLevelOfQualifications(levelOfQualifications)
                .setNumberOfSubjects(numberOfSubjects)
                .build();

        return  qualification;
    }
}
