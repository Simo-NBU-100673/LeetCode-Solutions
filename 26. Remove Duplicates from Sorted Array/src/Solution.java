import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if(nums == null){
            return 0;
        }

        int j=1;
        for(int i=1;i< nums.length;i++){
            if(nums[i]>nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return j;
    }
}
