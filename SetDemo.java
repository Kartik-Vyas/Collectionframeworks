import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(32);
        set.add(2);
        set.add(5);
        set.add(54);
        set.add(21);
        System.out.println(set);

        // no same elements allowed
        set.add(32);
        set.add(2);
        System.out.println(set);
        //remove
        set.remove(54);
        System.out.println(set);
        //contains()
        System.out.println(set.contains(32));
        //isEmpty()
        System.out.println(set.isEmpty());
        //size()
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
        System.out.println("---------------------");

        Set<Integer> link = new LinkedHashSet<>();
        link.add(32);
        link.add(2);
        link.add(5);
        link.add(54);
        link.add(21);

        System.out.println(link); // follows insertion order
        //methods are same as HashSet
        System.out.println("-------------------");

        Set<Integer> tree = new TreeSet<>(); // follows the sorted order
        tree.add(32);
        tree.add(2);
        tree.add(5);
        tree.add(54);
        System.out.println(tree);
    }
}
