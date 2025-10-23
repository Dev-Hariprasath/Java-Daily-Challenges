package Collections.List.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstLength {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("hari", "prasath", "ganesh", "ram",
                "mogan", "hari", "prasath", "ganesh", "xyz", "hari", "harini");

        Optional<String> str = st.stream()
                .filter(s -> s.length() > 5)
                .findFirst();

        System.out.println(str.isPresent() ? str.get() : "No Value");
    }
}
