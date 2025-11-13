package ShristiAcademy.Collections.List.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStrings {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("hari", "prasath", "ganesh", "ram", "mogan");

        Long count = str.stream()
                .filter(s -> s.length() >= 5)
                .collect(Collectors.counting());

        System.out.println("The count is " + count);
    }
}
