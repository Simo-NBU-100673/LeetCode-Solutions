import java.util.Arrays;

public class Solution {
    public static int[] plusOne(int[] digits) {
        System.out.println(Arrays.toString(digits));

        //clears the default case in which the number stays the same size
        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        //makes the temp array with one digit bigger just in case the number gets bigger
        int[] tmp = new int[digits.length+1];

        //start the copying of the array backwards
        for ( int i = digits.length - 1; i >= 0; i-- ) {
            //checks if the number is 9 and when it stops to be 9 it increments the first value after 9
            //if the number is 9 then we set the value in te corresponding place to 0
            if (digits[i] == 9) {
                if (i == 0) digits[i] = 1;
                else digits[i] = 0;
                tmp[i] = digits[i];
            } else {
                digits[i]++;
                return digits;
            }
        }
        return tmp;
    }

}

