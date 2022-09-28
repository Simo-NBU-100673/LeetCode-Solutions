import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//This algorithm gets array of integers and one targeted int and returns
// two int's from the array that summed are equal to the targeted int

public class Solution {
    //(r) brute force n-1*n(n-1/2)
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i< nums.length;i++){
            for(int j=i;j< nums.length;j++){
                if (j!=i && nums[j]+nums[i] == target){
                    return new int[]{j, i};
                }
            }
        }
        return new int[]{0};
    }

    //? time and space complexity in worst case O(n)
    public int[] twoSumFaster(int[] nums, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++){
            if(indexMap.containsKey(target - nums[i])){
                return new int[]{indexMap.get(target - nums[i]), i};
            }

            indexMap.put(nums[i], i);
        }
        return null;
    }

    //! Note that this algorithm is faster but more space consuming
    public int[] twoSumFastest(int[] nums, int target) {
        for(int i=1; i<nums.length; i++) {
            for(int j=i; j<nums.length; j++) {
                if (nums[j]+nums[j-i] == target) {
                    return new int[]{j-i,j};
                }
            }
        }
        return null;

    }

    //modified is faster sometimes
    public int[] twoSumMod(int[] nums, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();

        for(int i=0;i< nums.length;i++){
            indexMap.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            if(indexMap.containsKey(target - nums[i]) && i != indexMap.get(target - nums[i])){
                return new int[]{indexMap.get(target - nums[i]), i};
            }
        }
        return null;
    }
}
