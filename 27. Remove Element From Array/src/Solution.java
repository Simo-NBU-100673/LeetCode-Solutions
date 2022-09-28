import java.util.Arrays;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int end = nums.length;
        for(int i=0;i< end;i++){
            if(nums[i]==val){
                for (int j=i+1;j< end;j++){
                    nums[j-1]=nums[j];
                }
                nums[end-1]=val;
                end--;
            }
            System.out.println(Arrays.toString(nums));
        }
        return end;
    }

    public static int removeElement2(int[] nums, int val) {
        int end = nums.length-1;
        for(int i=0;i< end;i++){
            if(nums[i]==val){
                int j= nums.length-1;
                while (j>i && nums[j]==val){
                    j--;
                }
                //XOR swap
                nums[i] = nums[i]^nums[j];
                nums[j] = nums[i]^nums[j];
                nums[i] = nums[i]^nums[j];
                end--;
            }
            System.out.println(Arrays.toString(nums));
        }
        return end;
    }

    public static int removeElement3(int[] nums, int val){
        int end = nums.length;
        for(int i=0;i< end;i++){
            if(nums[i]==val){
                for (int j=i+1;j< end;j++){
                    nums[j-1]=nums[j];
                }
                nums[end-1]=val;
                end--;
            }
            System.out.println(Arrays.toString(nums));
        }
        return end;
    }

    // Много по-тъпи решения от моите
    public static int removeElement4(int[] nums, int val){
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            System.out.println(Arrays.toString(nums));
        }
        return i;
    }

    public static int removeElement5(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
            System.out.println(Arrays.toString(nums));
        }
        return n;
    }
}
