import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {   //use to implement min or max heap
    public static void main(String[] args) {

        //min heap
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(24);
        pq.offer(36);
        pq.offer(48);
        pq.offer(12);
        pq.offer(11);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());

        //max heap
        Queue<Integer> q=new PriorityQueue<>(Comparator.reverseOrder());
        q.offer(24);
        q.offer(36);
        q.offer(48);
        q.offer(12);
        q.offer(11);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());
    }
}
