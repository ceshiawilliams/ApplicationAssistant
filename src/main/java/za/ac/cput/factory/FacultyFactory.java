package za.ac.cput.factory;
import za.ac.cput.entity.Faculty;

public class FacultyFactory {

    public static Faculty getFaculty (String facultyCode, String facultyName, String facultyRequirements){

        return new Faculty.Builder()
                .setFacultyCode(facultyCode)
                .setFacultyName(facultyName)
                .setFacultyRequirements(facultyRequirements)
                .build();
    }
}
