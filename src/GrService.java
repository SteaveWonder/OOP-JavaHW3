public interface GrService {
    String saveGroupToTxt(String fileName, EducationGroup group);
    EducationGroup loadGroupFromTxt(String fileName);
}
