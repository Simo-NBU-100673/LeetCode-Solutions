import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(Arrays.toString(a.twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println();
        System.out.println(Arrays.toString(a.twoSumFaster(new int[]{3, 2, 4}, 6)));
        System.out.println();
        System.out.println(Arrays.toString(a.twoSumMod(new int[]{1, 2, 3,4,5}, 6)));
    }
}
