package za.ac.cput.entity.user;

public class PersonalDetail {
    private String contactEmail;
    private String contactCellNumber;
    private String qualificationType;

    private PersonalDetail(PersonalDetail.Builder builder){
        this.contactCellNumber = builder.contactCellNumber;
        this.contactEmail = builder.contactEmail;
        this.qualificationType = builder.qualificationType;
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

        public Builder setContactEmail(String contactEmail){
            this.contactEmail = contactEmail;
            return this;
        }

        public Builder setContactCellNumber(String contactCellNumber){
            this.contactCellNumber = contactCellNumber;
            return this;
        }

        public Builder setQualificationType(String qualificationType){
            this.qualificationType = qualificationType;
            return this;
        }

        public Builder copy(PersonalDetail personalDetail) {
            this.contactEmail = personalDetail.contactEmail;
            this.contactCellNumber = personalDetail.contactCellNumber;
            this.qualificationType = personalDetail.qualificationType;
            return this;
        }

        public PersonalDetail build(){
            return new PersonalDetail(this);
        }
    }
}
