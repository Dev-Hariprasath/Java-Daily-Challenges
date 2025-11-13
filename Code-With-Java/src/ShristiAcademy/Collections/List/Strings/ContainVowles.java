package ShristiAcademy.Collections.List.Strings;

import java.util.Arrays;
import java.util.List;

public class ContainVowles {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("hari", "prasath", "ganesh", "ram", "mogan", "xyz");

        for(String s : st){
            List<Character> ch = s.chars()
                    .mapToObj(c -> (char) c)
                    .toList();
            if(ch.contains('a') || ch.contains('e') || ch.contains('i')
                    || ch.contains('o') ||ch.contains('u')){
                System.out.println(s);
            }
        }
    }
}
