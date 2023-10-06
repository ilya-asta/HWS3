import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        StreamComparable group1 = new StreamComparable("Vasya", 5);
        StreamComparable group2 = new StreamComparable("Ilya", 4);
        StreamComparable group3 = new StreamComparable("Patya", 2);
        StreamComparable group4 = new StreamComparable("SASS",3 );
        StreamComparable group5 = new StreamComparable("LSFJ", 1);
        List<StreamComparable> groupList = new ArrayList<>(List.of(group1,group2,group3,group4,group5));
        StudentGroupIterator studentGroupIterator = new StudentGroupIterator(groupList);
        System.out.println(studentGroupIterator.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",",""));

//        System.out.println("==".repeat(8)+"Поочередный рвывод групп"+"==".repeat(8));

//        while (studentGroupIterator.hasNext()){
//            System.out.println(studentGroupIterator.getGroup(studentGroupIterator.getCount()).toString());
//            studentGroupIterator.next();
//        }

        System.out.println("==".repeat(5)+"Сортировка групп по ID"+"==".repeat(5));

        Collections.sort(groupList);
        System.out.println((groupList.toString())
                .replace("[", "")
                .replace("]", "")
                .replace(",",""));

        System.out.println("==".repeat(5)+"Реверсивная Сортировка групп по ID"+"==".repeat(5));// c помощью отдельного метода именно стрим компораТОР, а не компараБЛЕ)
        TreeSet<StreamComparable> reverse = new TreeSet<>(new StreamComparator());
        reverse.add(group1);
        reverse.add(group2);
        reverse.add(group3);
        reverse.add(group4);
        reverse.add(group5);
        System.out.println(reverse);


    }
}
