package za.ac.cput.entity;

public class Department {

    private String departmentName, departmentCode, departmentRequirements;


    private Department(Builder builder) {
        this.departmentCode = builder.departmentCode;
        this.departmentName = builder.departmentName;
        this.departmentRequirements = builder.departmentRequirements;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public String getDepartmentRequirements() {
        return departmentRequirements;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                ", departmentRequirements='" + departmentRequirements + '\'' +
                '}';
    }


    public static class Builder{

        private String departmentName;
        private String departmentCode;
        private String departmentRequirements;


        public Builder setDepartmentName (String departmentName){
            this.departmentName = departmentName;
            return this;
        }

        public Builder setDepartmentCode (String departmentCode){
            this.departmentCode = departmentCode;
            return this;
        }

        public Builder setDepartmentRequirements (String departmentRequirements){
            this.departmentRequirements = departmentRequirements;
            return this;
        }

        public Builder copy (Department department) {
            this.departmentName = department.departmentName;
            this.departmentCode = department.departmentCode;
            this.departmentRequirements = department.departmentRequirements;
            return this;
        }

        public Department build(){ return new Department(this);}

        }


    }




