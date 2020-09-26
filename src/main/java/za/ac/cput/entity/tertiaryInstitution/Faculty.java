package za.ac.cput.entity.tertiaryInstitution;

public class Faculty {
    private String facultyId;
    private String facultyName;
    private String facultyCode;
    //Add variable to say which institution this object belongs to

    private Faculty (Builder builder){
        this.facultyId = builder.facultyId;
        this.facultyCode = builder.facultyCode;
        this.facultyName = builder.facultyName;
    }

    public String getFacultyId() { return facultyId; }

    public String getFacultyName() { return facultyName;    }

    public String getFacultyCode() { return facultyCode;    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyId='" + facultyId + '\'' +
                ", facultyName='" + facultyName + '\'' +
                ", facultyCode='" + facultyCode + '\'' +
                '}';
    }

    public static class Builder{
        private String facultyId;
        private String facultyName;
        private String facultyCode;

        public Builder setFacultyId(String facultyId) {
            this.facultyId = facultyId;
            return this;
        }

        public Builder setFacultyName(String facultyName) {
            this.facultyName = facultyName;
            return this;
        }

        public Builder setFacultyCode(String facultyCode) {
            this.facultyCode = facultyCode;
            return this;
        }

        public Builder copy(Faculty faculty) {
            this.facultyId = faculty.facultyId;
            this.facultyName = faculty.facultyName;
            this.facultyCode = faculty.facultyCode;
            return this;
        }

        public Faculty build(){
            return new Faculty(this);
        }
    }
}
