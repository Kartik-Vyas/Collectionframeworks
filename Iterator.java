import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterations {
    public static void main(String[] args) {
        List list = List.of(10,20,30,40,50);
        //List.of() creates immutable object
        //list.add(60);
        //System.out.println(list); // error cannot add remove replace
        List newList = new ArrayList(list);
        // converts to mutable list
        System.out.println(newList);
        //for iterations
        for(int i = 0; i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println("---------------");

        for(Object elements : list)      //error if not used generics above to specify type of object <integer>
        {
            System.out.println(elements);
        }
        System.out.println("-----------------");

        //using iterator Interface and iterator() method

        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
