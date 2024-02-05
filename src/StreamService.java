import java.util.Collections;
import java.util.List;

public class StreamService implements StService {
    @Override
    public void sortByGroupCount(List<IStream> stream){
        StreamComparator comparator = new StreamComparator();
        Collections.sort(stream, comparator);
    }
}
