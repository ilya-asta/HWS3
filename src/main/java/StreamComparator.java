import java.util.Comparator;

public class StreamComparator implements Comparator<StreamComparable> {
    @Override
    public int compare(StreamComparable first, StreamComparable second) {
        return second.getId_group() - first.getId_group();
    }

    @Override
    public String toString() {
        return "StreamComparator{}";
    }
}
