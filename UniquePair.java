package vyas;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniquePair {
    public static void main(String[] args) {
        int[] arr = {1,3,7,8,5,1,4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose unique pair needed to be displayed");
        int num = sc.nextInt();
        Map<Integer,Integer> unique = new HashMap<>();

        for(int i=0;i<arr.length-1;i++)
        {
            int sum = 0;

            for(int j=i+1;j<arr.length;j++)
            {
               sum = arr[i]+arr[j];
               if(sum ==num)
               {
                   int key = Math.min(arr[i],arr[j]);
                   int value = Math.max(arr[i],arr[j]);
                   unique.put(key,value);
               }
               else{
                   continue;
               }
            }
        }
        System.out.println(unique);
    }
}
