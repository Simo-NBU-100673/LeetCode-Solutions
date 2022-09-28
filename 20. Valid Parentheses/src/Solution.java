import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        if(s.length()<2){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> hashMap = new HashMap<>();
        hashMap.put('}','{');
        hashMap.put(')','(');
        hashMap.put(']','[');
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)) {
                case '{', '(', '[' -> stack.push(s.charAt(i));
                case '}', ')', ']' -> {
                    if(!stack.isEmpty() && stack.peek()==hashMap.get(s.charAt(i))){
                        stack.pop();
                    }else {
                        return false;
                    }
                }
                default -> {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
