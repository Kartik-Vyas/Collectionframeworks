package vyas;


import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence
{
    public static void main(String[] args)
    {
        int [] arr = {3,9,10,1,2,4,5,20};
        Set<Integer> s = new HashSet<>();
        for(int num : arr)
        {
            s.add(num);
        }

        int maxLength=0;
        for(int i=0;i<arr.length;i++)
        {
            int length=0;
            if(! s.contains(arr[i] - 1))
            {
                int num = arr[i];
                int j=i;
                while(j<arr.length)
                {

                   if(s.contains(num))
                   {
                    length++;
                    num++;
                    j++;
                   }
                   else
                   {
                       j++;
                   }
                }
                if(length>maxLength)
                {
                    maxLength=length;
                }
            }
            else
            {
                continue;
            }
        }
        System.out.println("Longest consecutive subSequence is : " + maxLength);

    }
}
