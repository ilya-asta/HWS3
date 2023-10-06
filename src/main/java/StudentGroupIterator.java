import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<StreamComparable> {
    private List<StreamComparable> groupList;

    private int count;


    public StudentGroupIterator(List<StreamComparable> groupList) {
        this.groupList = groupList;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return count<groupList.size();
    }

    @Override
    public StreamComparable next() {
        if(!hasNext())
        {
            return null;
        }
        return groupList.get(count++);

    }

    public StreamComparable getGroup(int count) {
        return groupList.get(count);
    }
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Список груп " + "\n" + " " +groupList + '\n';
    }

}
