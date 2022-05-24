import ExceptionalCaseAboutSet.Student;

import java.util.*;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(13);
        list.add(75);
        list.add(34);
        list.add(5);
        list.add(94);

        System.out.println("Min element: "+ Collections.min(list));
        System.out.println("Max element: "+ Collections.max(list));
        System.out.println(Collections.frequency(list, 34));
        Collections.sort(list);//sort list in increasing order
        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder());//sort list in reverse order
        System.out.println(list);

        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Rahul",1));
        list1.add(new Student("Deewan",2));
        list1.add(new Student("Ram",3));
        list1.add(new Student("Mehul",4));
        list1.add(new Student("Ramesh",1));
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(list1);

        Collections.sort(list1, (o1,o2)-> o1.name.compareTo(o2.name));
        System.out.println(list1);
    }
}
