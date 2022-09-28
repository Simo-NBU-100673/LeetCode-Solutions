public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if(strs[0].isEmpty()){
            return "";
        }
        int i=0;
        while(Character.compare(strs[0].charAt(i),strs[1].charAt(i))==0 && Character.compare(strs[1].charAt(i),strs[2].charAt(i))==0){
            i++;
        }
        //return a substring from 0 to i
        if (i==0){
            return "";
        } else {
            return strs[0].substring(0,i);
        }
    }

    public static String longestCommonPrefix2(String[] strs){
        if(strs.length==1){
            return strs[0];
        }

        int i=0;
        boolean flag = true;
        char character;

        String result = "";
        while (flag && i<strs[0].length()){
            character = strs[0].charAt(i);
            for (String tmp: strs){
                try {
                    if (tmp.charAt(i) != character) {
                        flag = false;
                        break;
                    }
                }catch (StringIndexOutOfBoundsException e){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result = result+character;
            }
            i++;
        }
//        return strs[0].substring(0,i-1);
        return result;
    }

    public static String longestCommonPrefix3(String[] strs){
        if (strs.length == 0) {
            return "";
        }
//flower, flower, flow
        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() -1);
            }
        }

        return prefix;
    }
}
