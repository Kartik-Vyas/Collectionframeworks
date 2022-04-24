package HashSetCustom;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("Ramesh",2));
        set.add(new Student("Tbone",1));
        set.add(new Student("Anuj",3));
        set.add(new Student("Rahul",4));
        set.add(new Student("Nikhil",2));
        System.out.println(set);
        //Now to avoid duplicate we need to generate HashCode since Student is custom Class hence need to Override method.
    }
}
