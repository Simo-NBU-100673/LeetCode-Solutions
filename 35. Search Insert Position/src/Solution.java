public class Solution {
    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums,0, nums.length-1, target);
    }

    public static int binarySearch(int[] arr, int l, int r, int x)
    {
        if (r >= l) {
//            System.out.println();
//            System.out.println("l: " + l + "\nr: " + r); // debug
            int mid = l + (r - l) / 2;
//            System.out.println("mid: " + mid); // debug

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return l;
    }
}
