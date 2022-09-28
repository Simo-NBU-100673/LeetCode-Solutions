public class Solution {
    //With binary search Time complexity: (n*lon(n)) | Space complexity(1)
    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int start = 1, end = x, result=0;
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (mid*mid == x)
                return mid;

            if (mid*mid < x) {
                start = mid + 1;
                result = mid;
            }else {end = mid-1;}
        }
        return result;
    }

    // Function to return the square root of
    // a number using Newtons method
    static double squareRoot(double n, double l)
    {
        // Assuming the sqrt of n as n only
        double x = n;

        // The closed guess will be stored in the root
        double root;

        // To count the number of iterations
        int count = 0;

        while (true)
        {
            count++;

            // Calculate more closed x
            root = 0.5 * (x + (n / x));

            // Check for closeness
            if (Math.abs(root - x) < l)
                break;

            // Update root
            x = root;
        }
        System.out.println(count);
        return root;
    }

    //Newton–Raphson method efficient if we want to get the square root to a certain point of accuracy
    static double squareRootNewton(double n)
    {
        if(n==1||n==0){
            return n;
        }
        double x = n;
        double root;
        while (true)
        {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.01)
                break;
            x = root;
        }
        return (int)root;
    }

    //Newton-modified method most efficient if we want to return just the base of the square root
    static int squareRoot(int number){
        long root = number;
//        int count=0;
        while (root*root > number) {
//            count++;
            root = (root + number / root) / 2;
        }
//        System.out.println(count);
        return (int) root;
    }

}
