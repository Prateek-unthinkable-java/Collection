import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {

        Set<Integer> set= new TreeSet<>();  //it maintains the order of elements in increasing order
        set.add(12);                //it performs all operation with O(n)
        set.add(60);
        set.add(48);
        set.add(24);
        set.add(36);
        set.add(12);
        System.out.println(set);

        System.out.println(set.contains(24));
        System.out.println(set.contains(54));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
