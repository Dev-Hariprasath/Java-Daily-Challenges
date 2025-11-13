package ShristiAcademy.Collections.List.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstWord {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("hari", "prasath", "ganesh", "ram", "mogan");

       Optional<String> str = st.stream()
                .filter(s -> s.startsWith("h"))
                .findFirst();
        System.out.println(str.isPresent() ? str.get() : "No Words");

    }
}
