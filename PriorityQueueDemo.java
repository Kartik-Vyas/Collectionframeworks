import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
        // priority queue implements min heap hence any order you put it will be first element to be lowest
        p.offer(48);
        p.offer(12);
        p.offer(24);
        p.offer(36);
        System.out.println(p); // [12,24,36,48] only the first element will be the lowest
        System.out.println(p.peek());
        p.poll();
        p.poll();
        System.out.println(p);
        System.out.println("-------------------");

        PriorityQueue pq = new PriorityQueue(Comparator.reverseOrder());
        /// now it has given priority to max element since reverse
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        pq.offer(48);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
