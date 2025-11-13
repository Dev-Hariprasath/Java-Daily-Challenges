package ShristiAcademy.Strings;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyString {
    public static void main(String[] args) {
        String str = "babacccdeeeeefffffff";
        Map<Character, Long> frq = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        String result = "";

        for(char c : frq.keySet()){
            result += c;
            result += frq.get(c);
        }
        System.out.println("The frequency String is " +result);
    }
}
