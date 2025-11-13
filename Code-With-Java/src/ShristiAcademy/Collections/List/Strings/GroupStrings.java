package ShristiAcademy.Collections.List.Strings;

import java.util.*;

public class GroupStrings {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("hari", "prasath", "ganesh", "ram",
                "mogan", "hari", "prasath", "ganesh", "xyz", "hari", "harini");

        Map<Character, List<String>> frq = new HashMap<>();

        for(String s : st){
           Character ch = s.charAt(0);
            if(frq.containsKey(ch)){
                List<String> l = frq.get(ch);
                l.add(s);
                frq.put(ch, l);
            }else {
                List<String> list = new ArrayList<>();
                list.add(s);
                frq.put(ch, list);
            }
        }

        frq.forEach((k, v) ->
                System.out.println("The key is " + k + " & value is " +v));

    }
}
