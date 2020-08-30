package za.ac.cput.factory.tertiaryInstitution;

import za.ac.cput.entity.tertiaryInstitution.Institution;


public class InstitutionFactory {

    public static Institution createInstitution(String institutionName, String institutionCode) {

        Institution verification = new Institution.Builder()
                .setInstitutionName(institutionName)
                .setInstitutionCode(institutionCode)
                .build();
        return verification;

    }

}
