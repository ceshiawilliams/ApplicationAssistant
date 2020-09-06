package za.ac.cput.entity.previousQualification;

/** Ceshia Williams
 *
 *
 */
public class Qualification {
    private String qualificationId;
    private int numberOfSubjects;
    private String levelOfQualifications;

    private Qualification(Builder builder) {
        this.qualificationId = builder.qualificationId;
        this.numberOfSubjects = builder.numberOfSubjects;
        this.levelOfQualifications = builder.levelOfQualifications;
    }

    public String getQualificationId() { return qualificationId; }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public String getLevelOfQualifications() {
        return levelOfQualifications;
    }

    @Override
    public String toString() {
        return "Qualification{" +
                "qualificationId='" + qualificationId + '\'' +
                ", numberOfSubjects=" + numberOfSubjects +
                ", levelOfQualifications='" + levelOfQualifications + '\'' +
                '}';
    }

    public static class Builder {
        private String qualificationId;
        private int numberOfSubjects;
        private String levelOfQualifications;

        public Builder setQualificationId(String qualificationId) {
            this.qualificationId = qualificationId;
            return this;
        }

        public Builder setNumberOfSubjects(int numberOfSubjects) {
            this.numberOfSubjects = numberOfSubjects;
            return this;
        }

        public Builder setLevelOfQualifications(String levelOfQualifications) {
            this.levelOfQualifications = levelOfQualifications;
            return this;
        }

        public  Builder copy(Qualification qualification) {
            this.qualificationId = qualification.qualificationId;
            this.numberOfSubjects = qualification.numberOfSubjects;
            this.levelOfQualifications = qualification.levelOfQualifications;
            return this;
        }

        public Qualification build(){
            return new Qualification(this);
        }
    }
}
