package za.ac.cput.factory.tertiaryInstitution;

import za.ac.cput.entity.tertiaryInstitution.Department;

public class DepartmentFactory {

    public static Department createDepartment(String departmentName, String departmentCode, String departmentRequirements)
    {
        Department verification = new Department.Builder()
                .setDepartmentName(departmentName)
                .setDepartmentCode(departmentCode)
                .setDepartmentRequirements(departmentRequirements)
                .build();
        return verification;
    }
}
