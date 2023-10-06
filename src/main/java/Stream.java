import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Stream {    private int streamNum;
    private List<StreamComparable> groups;

    public Stream(int streamNum){
        this.streamNum = streamNum;
        this.groups = new ArrayList<>();
    }

    public void addGroup(StreamComparable group){
        this.groups.add(group);
    }

    public int getStreamNum() {
        return streamNum;
    }

    public List<StreamComparable> getGroups(){

        return groups;
    }

    public Iterator<StreamComparable> iterator(){
        return groups.iterator();
    }
}











