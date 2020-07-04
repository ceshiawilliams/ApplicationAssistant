package za.ac.cput.factory;

import za.ac.cput.entity.Qualification;

public class QualificationFactory {

    public static Qualification createQualification(String levelOfQualifications, int numberOfSubjects){
        Qualification qualification = new Qualification.Builder()
                .setLevelOfQualifications(levelOfQualifications)
                .setNumberOfSubjects(numberOfSubjects)
                .build();

        return  qualification;
    }
}
