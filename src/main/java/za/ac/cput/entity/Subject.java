<<<<<<< HEAD
package za.ac.cput.entity;

public class Subject {
    private String subjectName;
    private int subjectMark;

    private Subject(String subjectName, int subjectMark) {
        this.subjectName = subjectName;
        this.subjectMark = subjectMark;
    }

    public static class SubjectBuilder {
        private String subjectName;
        private int subjectMark;

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

        public SubjectBuilder setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }

        public SubjectBuilder setSubjectMark(int subjectMark) {
            this.subjectMark = subjectMark;
            return this;
        }

        public Subject createSubject() {
            return new Subject(subjectName, subjectMark);
        }
    }
}
=======
package za.ac.cput.entity;

public class Subject {
    private String subjectName;
    private int subjectMark;

    private Subject(String subjectName, int subjectMark) {
        this.subjectName = subjectName;
        this.subjectMark = subjectMark;
    }

    public static class SubjectBuilder {
        private String subjectName;
        private int subjectMark;

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

        public SubjectBuilder setSubjectName(String subjectName) {
            this.subjectName = subjectName;
            return this;
        }

        public SubjectBuilder setSubjectMark(int subjectMark) {
            this.subjectMark = subjectMark;
            return this;
        }

        public Subject createSubject() {
            return new Subject(subjectName, subjectMark);
        }
    }
}
>>>>>>> upstream/master
