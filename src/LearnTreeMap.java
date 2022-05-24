import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {

        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);

        numbers.remove(2);
        if(!numbers.containsKey("Two")){    //if, any individual value is not present then, it insert that value
            numbers.put("Two",22);
        }
        numbers.putIfAbsent("Six", 66);     //if, any individual value is not present then, it insert that value
        System.out.println(numbers);

        for(Map.Entry<String,Integer> e:numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        System.out.println(numbers.keySet());
        System.out.println(numbers.values());
        System.out.println(numbers.containsValue(66));
        System.out.println(numbers.isEmpty());
        numbers.clear();
        System.out.println(numbers);
    }
}
