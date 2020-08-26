package za.ac.cput.factory.tertiaryInstitution;
import za.ac.cput.entity.tertiaryInstitution.Faculty;

public class FacultyFactory {

    public static Faculty createFaculty (String facultyCode, String facultyName, String facultyRequirements){

        return new Faculty.Builder()
                .setFacultyCode(facultyCode)
                .setFacultyName(facultyName)
                .setFacultyRequirements(facultyRequirements)
                .build();
    }
}
