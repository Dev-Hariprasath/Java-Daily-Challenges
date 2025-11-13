package ShristiAcademy.Strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ConvertFirstLetterToUppercase {
    public static void main(String[] args) {
        String str = "i love java programming.";

        String s = Arrays.stream(str.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));

        System.out.println(s);
    }
}
