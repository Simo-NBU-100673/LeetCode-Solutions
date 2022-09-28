public class Solution {
    //very good video https://www.youtube.com/watch?v=Y0lT9Fck7qI
    //DP with memoization and DFS of three
    public static int climbStairs(int n) {
        int one = 1, two=1;
        for(int i=0;i<n-1;i++){
            one = one+two;
            two= one-two;
        }
        return one;
    }

    //fibonacci function that returns the nth fibonacci number
    public static int fib(int n){
        return f(n-1);
    }

    public static int f(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return f(n-1)+f(n-2);
    }
}
