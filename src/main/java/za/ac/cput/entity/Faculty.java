package za.ac.cput.entity;

public class Faculty {
    private String facultyName;
    private String facultyCode;
    private String facultyRequirements;

    private Faculty (Builder builder){

    }

    public String getFacultyName() { return facultyName;    }

    public String getFacultyCode() { return facultyCode;    }

    public String getFacultyRequirements() { return facultyRequirements; }


    @Override
    public String toString(){
        return "Faculty{" +
                "Faculty Name='" + facultyName + '\'' +
                ", Faculty Code='" + facultyCode + '\'' +
                ", Faculty Requirements='" + facultyRequirements + '\'' +
                '}';
    }

    public static class Builder{
        private String facultyName;
        private String facultyCode;
        private String facultyRequirements;

        public Builder setFacultyName(String facultyName) {
            this.facultyName = facultyName;
            return this;
        }

        public Builder setFacultyCode(String facultyCode) {
            this.facultyCode = facultyCode;
            return this;
        }

        public Builder setFacultyRequirements(String facultyRequirements) {
            this.facultyRequirements = facultyRequirements;
            return this;
        }

        public Faculty build(){
            return new Faculty(this);
        }
    }
}
