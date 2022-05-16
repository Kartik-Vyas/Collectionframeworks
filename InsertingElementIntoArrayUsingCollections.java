package vyas;

import java.util.ArrayList;
import java.util.List;

public class InsertingElementIntoArrayUsingCollections {
    public static void main(String[] args) {

        int [] arr = {5,8,20,23,37};
        int element = 18;
        int index = 2;

        List<Integer> a = new ArrayList<>();
        for(int num : arr)
        {
            a.add(num);
        }
        //Adding an element
        a.add(index,element);
        System.out.println(a);

    }
}
