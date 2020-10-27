//package za.ac.cput.entity.user;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//public class PersonalDetailQualification implements Serializable {
//    private String personalId;
//    private String qualificationId;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        PersonalDetailQualification that = (PersonalDetailQualification) o;
//        return personalId.equals(that.personalId) &&
//                qualificationId.equals(that.qualificationId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(personalId, qualificationId);
//    }
//}
