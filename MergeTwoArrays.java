package vyas;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {4,5,6,7,8,9};
        List<Integer> nums = new ArrayList<>();
        for(int num : a)
        {
            nums.add(num);
        }
        for(int num : b)
        {
            nums.add(num);
        }
        System.out.println(nums);
    }
}
