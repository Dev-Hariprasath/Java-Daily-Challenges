package GfgChallenge.String;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatingCharacter {
    public char nonRepeatingChar(String s) {
        Map<Character, Long> frq = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(char ch : s.toCharArray()){
            if(frq.get(ch) == 1){
                return ch;
            }
        }

        return '$';
    }
}
