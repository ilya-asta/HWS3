public class StreamComparable implements Comparable<StreamComparable>{
    @Override
    public int compareTo(StreamComparable o) {
        return id_group - o.getId_group();
    }
    protected String name_group;
    protected int id_group;

    public int getId_group() {
        return id_group;
    }

    @Override
    public String toString() {
        return "StudentGroup: " +
                "Название группы " + name_group + ' ' +
                "Id Группы " + id_group +
                '\n';
    }

    public StreamComparable(String name_group, int id_group) {
        this.name_group = name_group;
        this.id_group = id_group;
    }
}
