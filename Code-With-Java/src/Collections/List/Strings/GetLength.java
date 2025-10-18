package Collections.List.Strings;

import java.util.Arrays;
import java.util.List;

public class GetLength {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("hari", "prasath", "ganesh", "ram", "mogan");
        st.stream()
                .map(s -> s.length())
                .forEach(System.out::println);
    }
}
