package za.ac.cput.factory.user;

import za.ac.cput.entity.user.PersonalDetail;

public class PersonalDetailFactory {

    public static PersonalDetail createPersonalDetails(String contactEmail, String contactCellNumber, String qualificationType) {
        PersonalDetail information = new PersonalDetail.Builder()
                .setContactEmail(contactEmail)
                .setContactCellNumber(contactCellNumber)
                .setQualificationType(qualificationType)
                .build();
        return information;
    }
}
