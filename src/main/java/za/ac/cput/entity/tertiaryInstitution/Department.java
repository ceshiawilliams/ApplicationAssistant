package za.ac.cput.entity.tertiaryInstitution;

public class Department {

    private String departmentId;
    private String departmentName;
    private String departmentCode;
    //Create entity DepartmentCourse - shows which courses belong to which department

    private Department(){}

    private Department(Builder builder) {
        this.departmentId = builder.departmentId;
        this.departmentCode = builder.departmentCode;
        this.departmentName = builder.departmentName;
    }

    public String getDepartmentId() { return departmentId; }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }

    public static class Builder{
        private String departmentId;
        private String departmentName;
        private String departmentCode;


        public Builder setDepartmentId (String departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Builder setDepartmentName (String departmentName){
            this.departmentName = departmentName;
            return this;
        }

        public Builder setDepartmentCode (String departmentCode){
            this.departmentCode = departmentCode;
            return this;
        }

        public Builder copy (Department department) {
            this.departmentId = department.departmentId;
            this.departmentName = department.departmentName;
            this.departmentCode = department.departmentCode;
            return this;
        }

        public Department build(){ return new Department(this);}

        }


    }




