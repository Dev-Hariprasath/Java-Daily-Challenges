package ShristiAcademy.Strings;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCharacter {
    public static void main(String[] args) {
        String str = "hariprasath";
        System.out.println("Character - Frequency");
        str.chars()
                .mapToObj( c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                         Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
