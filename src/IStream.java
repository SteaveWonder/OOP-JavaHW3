import java.util.List;

public interface IStream {

    List<IGroup> getGroups();

    void addGroup(IGroup group);

    int getCountGroups();

    IGroup getGroup(int index);

    void setName(String name);
    String getName();
}
