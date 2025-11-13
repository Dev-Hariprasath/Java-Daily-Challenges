package ShristiAcademy.Strings;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {
    public static void main(String[] args) {
        String str = "I love Java programming language";

        String s = Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println("The Longest String is " + s + " - " + s.length());
    }
}
