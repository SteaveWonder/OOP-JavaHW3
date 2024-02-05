import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class Control {
    private static final StreamService streamService = new StreamService();
    private static final EducationGroupService groupService = new EducationGroupService();
    private static int lastGroupNumber = 0;

    public static Stream newStream(String name,  int countGroups, int minStudentCount, int maxStudentCount){
        Stream stream = new Stream(name);
        Random random = new Random();

        for (int i = 0; i < countGroups; i++) {
            stream.addGroup(newGroup(random.nextInt(minStudentCount, maxStudentCount)));
        }
        return stream;
    }
    public static void showGroupList(Stream stream){
        Logger logger = Logger.getAnonymousLogger();

        for (var g : stream) {
            logger.info(g.toString());
        }
    }

    public static void sortListStream(List<IStream> list){
        streamService.sortByGroupCount(list);
    }
    public static EducationGroup newGroup(int countStudent){
        List<Student> students = new ArrayList<>();

        for (int i=1; i<=countStudent; i++){
            students.add(new Student(String.format("%d student", i), "10.07.2008", i));
        }

        lastGroupNumber++;

        return new EducationGroup(lastGroupNumber,
                String.format("group %d", lastGroupNumber),
                new Teacher("Ivanov", "08.07.1989",1, "teacher"),
                students);
    }
    public static EducationGroup readGroup(String fileName){
        return groupService.loadGroupFromTxt(fileName);
    }

    public static void saveGroup(String fileName, EducationGroup group){
        groupService.saveGroupToTxt(fileName, group);
    }
}
