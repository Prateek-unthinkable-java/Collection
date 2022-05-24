import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();   //it maintains the order of element as they were inserted
        set.add(12);
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
