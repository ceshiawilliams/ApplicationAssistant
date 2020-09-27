package za.ac.cput.service.previousQualification.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.previousQualification.Qualification;
import za.ac.cput.entity.previousQualification.Subject;
import za.ac.cput.entity.tertiaryInstitution.Course;
import za.ac.cput.repository.previousQualification.QualificationRepository;
import za.ac.cput.repository.previousQualification.impl.QualificationRepositoryImpl;
import za.ac.cput.service.previousQualification.QualificationService;
import za.ac.cput.service.tertiaryInstitution.impl.CourseServiceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
@Service
public class QualificationServiceImpl implements QualificationService {

    private static QualificationService service = null;
    private QualificationRepository repository;

    public QualificationServiceImpl(){

        this.repository = QualificationRepositoryImpl.getRepository();
    }

    public static QualificationService getService(){

        if (service == null) service = new QualificationServiceImpl();

        return service;
    }

    @Override
    public Set<Qualification> getAll() {
        return this.repository.getAll();
    }


    @Override
    public Set<Qualification> getAllStartingWithD() {
        Set<Qualification> qualifications = getAll();
        Set<Qualification> secureWithD = new HashSet<>();

        for (Qualification qualification: qualifications){
            if (qualification.getLevelOfQualifications().trim().toLowerCase().startsWith("d")){
                secureWithD.add(qualification);
            }
        }
        return secureWithD;
    }

    /*@Override
    public ArrayList<Course> checkIfQualifies(Qualification qualification) {
        ArrayList<Course> subjectsQualified = new ArrayList<>();
        Set<Course> courseLIst = CourseServiceImpl.getService().getAll();
        for(Course course : courseLIst)
        {
            int passed = 0;
            for(Subject subject : qualification.getSubjectList())
            {
                for(Subject requirement : course.getCourseRequirement())
                {
                    if(subject.getSubjectName() == requirement.getSubjectName())
                    {
                        if(subject.getSubjectMark() >= requirement.getSubjectMark())
                        {
                            passed++;
                        }
                    }
                }

            }
            if(passed == course.getCourseRequirement().size())
            {
                subjectsQualified.add(course);
            }
        }
        return subjectsQualified;
    }*/

    @Override
    public Qualification create(Qualification qualification) {
        return this.repository.create(qualification);
    }

    @Override
    public Qualification read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Qualification update(Qualification qualification) {
        return this.repository.update(qualification);
    }

    @Override
    public boolean delete(String s) {
        return this.repository.delete(s);
    }
}
