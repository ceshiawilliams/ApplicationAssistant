package za.ac.cput.entity.previousQualification;

public class Subject {
    private String subjectId;
    private String subjectName;
    private int subjectMark;

    private Subject(Builder builder) {
        this.subjectId = builder.subjectId;
        this.subjectName = builder.subjectName;
        this.subjectMark = builder.subjectMark;
    }

    public String getSubjectId() { return subjectId; }

    public String getSubjectName() {
        return subjectName;
    }

    public int getSubjectMark() {
        return subjectMark;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectId='" + subjectId + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", subjectMark=" + subjectMark +
                '}';
    }

    public static class Builder {
        private String subjectId;
        private String subjectName;
        private int subjectMark;

        public Builder setSubjectId(String subjectId) {
            this.subjectId = subjectId;
            return this;
        }

        public Builder setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }

        public Builder setSubjectMark(int subjectMark) {
            this.subjectMark = subjectMark;
            return this;
        }

        public Builder copy(Subject subject) {
            this.subjectId = subject.subjectId;
            this.subjectName = subject.subjectName;
            this.subjectMark = subject.subjectMark;
            return this;
        }

        public Subject build() {
           return new Subject(this);
        }
    }

}


