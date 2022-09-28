public class Solution {
    public static boolean isPalindrome(int x) {
        int tmp = x;
        int reversed = 0;

        //! Fixed cases:
        //! 1. x to be a negative number =>(NOT PALINDROME)
        if(x<0){
            return false;
        }
        //! 2. x's length to be 1. =>(PALINDROME)
        if (x/10 == 0){
            return true;
        }

        while (x>0){
            reversed = x%10 + reversed*10;
            x /= 10;

//            reversed *=10;
//            reversed += x%10;
//            x /= 10;
        }
        return tmp==reversed;
    }
}
