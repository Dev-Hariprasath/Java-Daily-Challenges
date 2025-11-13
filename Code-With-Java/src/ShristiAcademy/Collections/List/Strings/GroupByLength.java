package ShristiAcademy.Collections.List.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("hari", "prasath", "ganesh", "ram",
                "mogan", "hari", "prasath", "ganesh", "xyz", "hari", "harini");

        System.out.println("Key - Values");
        st.stream()
                .collect(Collectors.groupingBy(String::length))
                .forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
