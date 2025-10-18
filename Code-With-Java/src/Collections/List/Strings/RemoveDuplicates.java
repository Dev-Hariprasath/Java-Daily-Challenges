package Collections.List.Strings;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("hari", "prasath", "ganesh", "ram", "mogan", "prasath", "ganesh");

        str.stream()
                .distinct()
                .forEach(System.out :: println);

    }
}
