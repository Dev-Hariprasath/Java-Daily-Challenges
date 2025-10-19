package Collections.List.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveEmptyValue {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("hari", "prasath", "ganesh", "ram", "mogan", null, "");

        st.stream()
                .filter(Objects::nonNull)
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);

    }
}
