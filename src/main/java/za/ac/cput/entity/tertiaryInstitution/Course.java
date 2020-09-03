package za.ac.cput.entity.tertiaryInstitution;

public class Course {

    private String courseId, courseName, courseCode;


    private Course(Builder builder) {
        this.courseId = builder.courseId;
        this.courseCode = builder.courseCode;
        this.courseName = builder.courseName;
    }

    public String getCourseId() { return courseId; }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }

    public static class Builder{
        private String courseId;
        private String courseName;
        private String courseCode;

        public Builder setCourseId(String courseId) {
            this.courseId = courseId;
            return this;
        }

        public Builder setCourseName (String courseName){
            this.courseName =courseName;
            return this;
        }

        public Builder setCourseCode (String courseCode){
            this.courseCode =courseCode;
            return this;
        }

        public Builder copy (Course course){
            this.courseId = course.courseId;
            this.courseName = course.courseName;
            this.courseCode = course.courseCode;
            return this;
        }

        public Course build(){return new Course (this);}

    }
}
