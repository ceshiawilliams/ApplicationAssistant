package za.ac.cput.entity;

public class PersonalDetails {
    private String contactEmail;
    private String contactCellNumber;
    private String qualificationType;

    private PersonalDetails (PersonalDetails.Builder builder){

    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactCellNumber() {
        return contactCellNumber;
    }

    public String getQualificationType() {
        return qualificationType;
    }

    @Override
    public String toString() {
        return "PersonalDetails{" +
                "contactEmail='" + contactEmail + '\'' +
                ", contactCellNumber='" + contactCellNumber + '\'' +
                ", qualificationType='" + qualificationType + '\'' +
                '}';
    }

    public static class Builder{
        private String contactEmail;
        private String contactCellNumber;
        private String qualificationType;

        public PersonalDetails.Builder setContactEmail(String contactEmail){
            this.contactEmail = contactEmail;
            return this;
        }

        public PersonalDetails.Builder setContactCellNumber(String contactCellNumber){
            this.contactCellNumber = contactCellNumber;
            return this;
        }

        public PersonalDetails.Builder setQualificationType(String qualificationType){
            this.qualificationType = qualificationType;
            return this;
        }

        public PersonalDetails.Builder copy(PersonalDetails personalDetails) {
            this.contactEmail = personalDetails.contactEmail;
            this.contactCellNumber = personalDetails.contactCellNumber;
            this.qualificationType = personalDetails.qualificationType;
            return this;
        }

        public PersonalDetails build(){
            return new PersonalDetails(this);
        }
    }
}
