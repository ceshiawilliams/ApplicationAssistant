package za.ac.cput.entity;

/** Ceshia Williams
 *
 *
 */
public class Qualification {
    private int numberOfSubjects;
    private String levelOfQualifications;

    private Qualification(Builder builder) {
        this.numberOfSubjects = builder.numberOfSubjects;
        this.levelOfQualifications = builder.levelOfQualifications;
    }

    public int getNumberOfSubjects() {
        return numberOfSubjects;
    }

    public String getLevelOfQualifications() {
        return levelOfQualifications;
    }

    @Override
    public String toString() {
        return "Qualification{" +
                "numberOfSubjects='" + numberOfSubjects + '\'' +
                ", levelOfQualifications='" + levelOfQualifications + '\'' +
                '}';
    }

    public static class Builder {
        private int numberOfSubjects;
        private String levelOfQualifications;

        public Builder setNumberOfSubjects(int numberOfSubjects) {
            this.numberOfSubjects = numberOfSubjects;
            return this;
        }

        public Builder setLevelOfQualifications(String levelOfQualifications) {
            this.levelOfQualifications = levelOfQualifications;
            return this;
        }

        public Builder copy(Qualification qualification) {
            this.numberOfSubjects = qualification.numberOfSubjects;
            this.levelOfQualifications = qualification.levelOfQualifications;
            return this;
        }

        public Qualification build(){
            return new Qualification(this);
        }
    }
}
