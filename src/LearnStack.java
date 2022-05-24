import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals=new Stack<>();

        animals.push("Lion");
        animals.push("Cat");
        animals.push("Dog");
        animals.push("Tiger");
        System.out.println("Stack: "+animals);
        System.out.println("Top element: "+animals.peek());//returns top of stack

        animals.pop();
        System.out.println(animals);
    }
}
