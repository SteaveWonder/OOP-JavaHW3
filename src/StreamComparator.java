import java.util.Comparator;

public class StreamComparator implements Comparator<IStream> {
    @Override
    public int compare(IStream o1, IStream o2) {
        return Integer.compare(o1.getCountGroups(), o2.getCountGroups());
    }
}
