public class Solution {
    public static int lengthOfLastWord(String s) {
        int result=0;

        //start searching backwards and getting every char from end to beginning of the String s
        for(int i=s.length()-1;i>=0;i--){

            //If the current char is not a white space that means this is the first occurred word
            if(s.charAt(i) != ' '){

                //we start counting every char after the first occurred non-blank char as we move to the beginning of the String
                for (int j=i;j>=0 && s.charAt(j)!=' ';j--){
                    result++;
                }

                //when we got to this point we stop the program so that only the first word is counted
                break;
            }
        }
        return result;
    }
}
