package vyas;

import java.util.HashSet;

public class RemoveDuplicateElementsUnsortedArray {
    public static void main(String[] args) {
         int[] a = {1,2,3,2,4,6,1,5};

        HashSet<Integer> nums = new HashSet<>();
        for(int num : a)
        {
            nums.add(num);
        }
        System.out.println(nums);
    }
}
