package ShristiAcademy.Collections.List.Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ConvertUppercase {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("hari", "prasath", "ganesh", "ram", "mogan");

        str.stream()
                .map(String :: toUpperCase)
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

    }
}
