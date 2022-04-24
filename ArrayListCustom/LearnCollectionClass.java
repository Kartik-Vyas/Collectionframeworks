package ArrayListCustom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Anuj",2));
        list.add(new Student("Ramesh",4));
        list.add(new Student("Shivam",3));
        list.add(new Student("Rohit",1));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
