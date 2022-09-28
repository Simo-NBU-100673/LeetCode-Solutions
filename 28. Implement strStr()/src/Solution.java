public class Solution {
    public static int strStr(String haystack, String needle) {
      if(needle.isEmpty()){
            return 0;
        }
        if(needle.length()>haystack.length()){
            return -1;
        }
        for(int i=0;i<haystack.length();i++){
            if(i+needle.length()>haystack.length()){
                return -1;
            }
            if(haystack.charAt(i)==needle.charAt(0)){
                int counter=0;

                for(int j=i;j<needle.length()+i && haystack.charAt(j)==needle.charAt(j-i);j++){
                    counter++;
                }
                if(counter==needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}
