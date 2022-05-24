import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //adding elements to queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        System.out.println(queue);
        System.out.println(queue.poll());//returns front of queue and delete it
        System.out.println(queue);
        System.out.println(queue.peek());//returns front of queue



    }
}
