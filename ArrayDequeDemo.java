import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque adq = new ArrayDeque();
        adq.offer(23);
        adq.offerFirst(12);
        adq.offerLast(48);
        System.out.println(adq);
        adq.offer(58);
        System.out.println(adq);
        //peek operations
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        //poll operations
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);
    }
}
