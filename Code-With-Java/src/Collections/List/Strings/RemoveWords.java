package Collections.List.Strings;

import java.util.Arrays;
import java.util.List;

public class RemoveWords {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("abc", "aaaaabb", "bbacs", "abababa", "cacaca", "abcabac");
        st.stream()
                .filter(s -> !s.startsWith("a"))
                .forEach(System.out::println);
    }
}
