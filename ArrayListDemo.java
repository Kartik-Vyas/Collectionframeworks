import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2,3);
        System.out.println(list);
        List<Integer> newList = new ArrayList<>();
        newList.add(150);
        newList.add(160);
        list.addAll(newList);
        System.out.println(list);
        //get
        System.out.println(list.get(3));
        //remove
        System.out.println(list.remove(1));
        System.out.println(list.remove(Integer.valueOf(1)));
        System.out.println(list);
        //set
        list.set(1,4);
        //set method replace the index position value by specified value i.e (4--150)
        System.out.println(list);
        //contains
        //returns a boolean value based on specified content
        System.out.println(list.contains(160));
        //clear
        list.clear();
        System.out.println(list);
    }
}
