package Collections.List.Strings;

import java.util.Arrays;
import java.util.List;

public class FindWord {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("hari ram", "hari prasath","hari", "ganesh", "ram", "ram mogan");
        str.stream()
                .filter( s -> s.contains("ram"))
                .forEach(System.out::println);

    }
}
