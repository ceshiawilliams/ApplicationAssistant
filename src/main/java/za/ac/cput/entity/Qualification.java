package za.ac.cput.entity;

/** Ceshia Williams
 *
 *
 */
public class Qualification {
    private String numberOfSubjects;
    private String levelOfQualifications;

    public static void main( String[] args )
    {

    }

    private Qualification(String numberOfSubjects, String levelOfQualifications) {
        this.numberOfSubjects = numberOfSubjects;
        this.levelOfQualifications = levelOfQualifications;
    }

    public String getNumberOfSubjects() {
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

    public static class QualificationBuilder {
        private String numberOfSubjects;
        private String levelOfQualifications;

        public QualificationBuilder setNumberOfSubjects(String numberOfSubjects) {
            this.numberOfSubjects = numberOfSubjects;
            return this;
        }

        public QualificationBuilder setLevelOfQualifications(String levelOfQualifications) {
            this.levelOfQualifications = levelOfQualifications;
            return this;
        }

        public Qualification createQualification() {
            return new Qualification(numberOfSubjects, levelOfQualifications);
        }
    }
}
