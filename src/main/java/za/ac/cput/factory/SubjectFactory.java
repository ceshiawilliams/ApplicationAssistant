package za.ac.cput.factory;

import za.ac.cput.entity.Subject;

public class SubjectFactory {

    public static Subject createSubject(String subjectName, int subjectMark){
        Subject subject = new Subject.Builder()
                .setSubjectName(subjectName)
                .setSubjectMark(subjectMark)
                .createSubject();

        return subject;
    }
}
