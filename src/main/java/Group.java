public class Group {
    protected String student_name;
    protected int id_student;
    protected int year_of_study;

    public Group(String student_name, int id_student, int year_of_study) {
        this.student_name = student_name;
        this.id_student = id_student;
        this.year_of_study = year_of_study;
    }

    public String getStudent_name() {
        return student_name;
    }

    public int getId_student() {
        return id_student;
    }

    @Override
    public String toString() {
        return "Group{" +
                "student_name='" + student_name + '\'' +
                ", id_student=" + id_student +
                ", year_of_study=" + year_of_study +
                '}';
    }
}
