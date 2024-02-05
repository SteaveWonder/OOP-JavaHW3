import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();

        List<IStream> streams = new ArrayList<>();

        streams.add(Control.newStream("Math", 6, 10, 15));
        streams.add(Control.newStream("Physic", 8, 15, 20));
        streams.add(Control.newStream("Chemistry", 7, 10, 16));

        logger.info("-- CREATE --");;
        for (IStream s : streams) {
            logger.info(s.toString());
        }

        Control.sortListStream(streams);

        logger.info("-- SORT --");;
        for (IStream s : streams) {
            logger.info(s.toString());
        }

        logger.info("-- ITERATION --");
        logger.info(streams.get(2).getName());
        Control.showGroupList((Stream) streams.get(2));
    }
}