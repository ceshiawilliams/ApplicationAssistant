package za.ac.cput.factory;

import za.ac.cput.entity.PersonalDetails;

public class PersonalDetailsFactory {

    public static PersonalDetails createPersonalDetails(String contactEmail, String contactCellNumber, String qualificationType) {
        PersonalDetails information = new PersonalDetails.Builder()
                .setContactEmail(contactEmail)
                .setContactCellNumber(contactCellNumber)
                .setQualificationType(qualificationType)
                .build();
        return information;
    }
}
