import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.offer(40);
        queue.offer(23);
        queue.offer(38);
        queue.offer(55);
        System.out.println(queue);
        //linkedList follow the insertion order
        //peek
        System.out.println(queue.peek());
        //poll
        System.out.println(queue.poll()); // element getting out of list
        System.out.println(queue);
    }
}
