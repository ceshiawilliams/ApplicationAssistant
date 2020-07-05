package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.entity.Department;

public class DepartmentFactoryTest {

    @Test
    public void createDepartment() {

        Department verification = DepartmentFactory.createDepartment( "Information Technology", "IT", "NSC");

        Assert.assertEquals("Information Technology", verification.getDepartmentName());
        Assert.assertEquals("IT", verification.getDepartmentCode());
        Assert.assertEquals("NSC", verification.getDepartmentRequirements());

    }
}
