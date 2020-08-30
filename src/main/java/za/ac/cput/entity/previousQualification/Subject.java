package za.ac.cput.entity.previousQualification;

public class Subject {
    private String subjectName;
    private int subjectMark;

    private Subject(String subjectName,int subjectMark) {
        this.subjectName = subjectName;
        this.subjectMark = subjectMark;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getSubjectMark() {
        return subjectMark;
    }

    @Override
    public String toString() {
        return "SubjectBuilder{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectMark=" + subjectMark +
                '}';
    }

    public static class Builder {


        private String subjectName;
        private int subjectMark;

        public Builder setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }

        public Builder setSubjectMark(int subjectMark) {
            this.subjectMark = subjectMark;
            return this;
        }

        public Builder copy(Subject subject) {
            this.subjectName = subject.subjectName;
            this.subjectMark = subject.subjectMark;
            return this;
        }

     /*   public Subject createSubject() {
            return new Subject(subjectName, subjectMark);
        }*/

        public Subject build() {
           return new Subject(subjectName,subjectMark);


        }

    }

}


