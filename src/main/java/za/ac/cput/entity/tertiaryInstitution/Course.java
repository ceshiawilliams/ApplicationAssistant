package za.ac.cput.entity.tertiaryInstitution;

import za.ac.cput.entity.previousQualification.Subject;

import java.util.ArrayList;
import java.util.Set;

public class Course {

    private String courseId;
    private String courseName;
    private String courseCode;
    private Set<Subject> courseRequirement;
    private String courseFees;
    //Add variable to say which department this object belongs to

    private Course(Builder builder) {
        this.courseId = builder.courseId;
        this.courseCode = builder.courseCode;
        this.courseName = builder.courseName;
        this.courseRequirement = builder.courseRequirement;
        this.courseFees = builder.courseFees;
    }

    public String getCourseId() { return courseId; }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Set<Subject> getCourseRequirement() {
        return courseRequirement;
    }

    public String getCourseFees() {
        return courseFees;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                ", courseRequirement='" + courseRequirement + '\'' +
                ", courseFees=' R" + courseFees + '\'' +
                '}';
    }

    public static class Builder{
        private String courseId;
        private String courseName;
        private String courseCode;
        private Set<Subject> courseRequirement;
        private String courseFees;

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

        public Builder setCourseRequirement (Set<Subject> courseRequirement){
            this.courseRequirement = courseRequirement;
            return this;
        }

        public Builder setCourseFees (String courseFees){
            this.courseFees =courseFees;
            return this;
        }

        public Builder copy (Course course){
            this.courseId = course.courseId;
            this.courseName = course.courseName;
            this.courseCode = course.courseCode;
            this.courseRequirement = course.courseRequirement;
            this.courseFees = course.courseFees;
            return this;
        }

        public Course build(){return new Course (this);}

    }
}
