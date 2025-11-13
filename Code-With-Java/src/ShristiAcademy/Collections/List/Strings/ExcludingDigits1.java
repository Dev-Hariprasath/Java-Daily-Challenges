package ShristiAcademy.Collections.List.Strings;

import java.util.Arrays;
import java.util.List;

public class ExcludingDigits1 {
    public static void main(String[] args) {
        List<String> st = Arrays.asList(
                "hari123", "java8", "prasath", "99ganesh", "ram", "4558", "1as",
                "dfd12vv", "hfbj25", "123");

        st.stream()
                .filter(s -> s.matches(".*[a-zA-Z].*"))
                .forEach(System.out::println);

    }
}
