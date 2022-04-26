import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        List list = Arrays.asList(nums);
        List Target = new ArrayList();  
        for (int i = 0;i<nums.length;i++)
        {
            for (int j = index[i];j<index.length;j++)
            {
                Target.add(j,nums[i]);
                break;
            }
        }
        System.out.println(Target);
    }
}
