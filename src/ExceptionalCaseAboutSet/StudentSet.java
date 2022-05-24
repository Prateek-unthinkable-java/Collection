package ExceptionalCaseAboutSet;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        //this example is for when we have a real time object which use set
        Set<Student> studentSet=new HashSet<>();
        studentSet.add(new Student("Rahul",1));
        studentSet.add(new Student("Deewan",2));
        studentSet.add(new Student("Ram",3));
        studentSet.add(new Student("Mehul",4));
        studentSet.add(new Student("Ramesh",1));

        System.out.println(studentSet);
    }
}
