package Collections.List.Strings;

import java.util.Arrays;
import java.util.List;

public class LongestWord {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("hari", "prasath", "ganesh", "ram", "mogan");
        int maxLen = 0;
        String result = "";

        for(String s : st){
            if(s.length() > maxLen){
                maxLen = s.length();
                result = s;
            }
        }

        System.out.println(result);
    }
}
