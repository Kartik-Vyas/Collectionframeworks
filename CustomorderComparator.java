import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>
{
    public int compare(String value1,String value2)
    {
        return Integer.compare(value1.length(),value2.length());
    }
}
public class CustomorderQueue {
    public static void main(String[] args) {
        Queue<String> animals = new PriorityQueue<>(new StringLengthComparator());
        animals.addAll(List.of("Zebra","Elephant","Fox"));
        System.out.println(animals);
        // Priority based on length for that we need to add comparator
        System.out.println(animals);
        // for decending order just reverse return value to value2.length(),value1.length()
    }
}
