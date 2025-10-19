package Collections.List.Strings;

import java.util.Arrays;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("hari", "prasath", "ganesh", "ram", "mogan");

        st.stream()
                .map(s -> new StringBuilder(s).reverse().toString())
                .forEach(System.out::println);
    }
}
