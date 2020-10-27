package za.ac.cput.entity.previousQualification;

import java.io.Serializable;
import java.util.Objects;

public class QualificationSubjectId implements Serializable {

    private String QualificationId, SubjectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QualificationSubjectId that = (QualificationSubjectId) o;
        return QualificationId.equals(that.QualificationId) &&
                SubjectId.equals(that.SubjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(QualificationId,SubjectId);
    }
}
