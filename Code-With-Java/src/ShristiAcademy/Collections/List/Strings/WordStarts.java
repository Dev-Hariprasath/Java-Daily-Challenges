package ShristiAcademy.Collections.List.Strings;

import java.util.Arrays;
import java.util.List;

public class WordStarts {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("hari", "prasath", "ram", "abi", "mogan", "ragul");
        st.stream()
                .filter(s -> s.startsWith("r"))
                .forEach(System.out::println);
    }
}
