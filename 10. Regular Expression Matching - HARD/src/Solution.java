import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public boolean isMatch(String s, String p) {
        //using regex find if the regex in p matches the string in s
        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
