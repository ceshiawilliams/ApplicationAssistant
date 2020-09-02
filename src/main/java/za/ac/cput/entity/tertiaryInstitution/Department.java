package za.ac.cput.entity.tertiaryInstitution;

public class Department {

    private String departmentId, departmentName, departmentCode, departmentRequirements;


    private Department(Builder builder) {
        this.departmentId = builder.departmentId;
        this.departmentCode = builder.departmentCode;
        this.departmentName = builder.departmentName;
        this.departmentRequirements = builder.departmentRequirements;
    }

    public String getDepartmentId() { return departmentId; }

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
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                ", departmentRequirements='" + departmentRequirements + '\'' +
                '}';
    }

    public static class Builder{
        private String departmentId;
        private String departmentName;
        private String departmentCode;
        private String departmentRequirements;


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

        public Builder setDepartmentRequirements (String departmentRequirements){
            this.departmentRequirements = departmentRequirements;
            return this;
        }

        public Builder copy (Department department) {
            this.departmentId = department.departmentId;
            this.departmentName = department.departmentName;
            this.departmentCode = department.departmentCode;
            this.departmentRequirements = department.departmentRequirements;
            return this;
        }

        public Department build(){ return new Department(this);}

        }


    }




