import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); //it generates hash codes for each element and prints element randomly
        set.add(12);                //it performs all operation with O(1)
        set.add(24);
        set.add(36);
        set.add(48);
        set.add(60);
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
