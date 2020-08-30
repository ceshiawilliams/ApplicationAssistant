package za.ac.cput.repository.tertiaryInstitution.impl;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.cput.entity.security.Security;
import za.ac.cput.entity.tertiaryInstitution.Department;
import za.ac.cput.factory.security.SecurityFactory;
import za.ac.cput.factory.tertiaryInstitution.DepartmentFactory;
import za.ac.cput.repository.security.SecurityRepository;
import za.ac.cput.repository.security.impl.SecurityRepositoryImpl;
import za.ac.cput.repository.tertiaryInstitution.DepartmentRepository;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentRepositoryImplTest {

    private static DepartmentRepository repository = DepartmentRepositoryImpl.getRepository();
    private static Department department = DepartmentFactory.createDepartment("Engineering", "Eng123", "60% Average");

    @Test
    public void d_getAll()
    {
        System.out.println("Get All: " + repository.getAll());
    }

    @Test
    public void a_create()
    {
        Department created = repository.create(department);
        Assert.assertEquals(department.getDepartmentName(), created.getDepartmentName());
        Assert.assertEquals(department.getDepartmentCode(), created.getDepartmentCode());
        Assert.assertEquals(department.getDepartmentRequirements(), created.getDepartmentRequirements());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read()
    {
        Department read = repository.read(department.getDepartmentCode());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update()
    {
        Department updated = new Department.Builder().copy(department).setDepartmentRequirements("65% Average").build();
        updated = repository.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete()
    {
        boolean deleted = repository.delete(department.getDepartmentCode());
        Assert.assertTrue(deleted);
    }
}