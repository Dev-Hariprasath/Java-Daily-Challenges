package Collections.List.Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortBasedOnLength {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("hari", "prasath", "ganesh", "ram", "mogan");
        st.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }
}
