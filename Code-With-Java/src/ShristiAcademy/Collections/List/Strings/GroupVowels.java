package ShristiAcademy.Collections.List.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupVowels {
    public static void main(String[] args) {
        List<String> st = Arrays.asList(
                "hari", "prasath", "ghd","ganesh", "ram", "mogan", "xys", "rtv");
        st.stream()
                .collect(Collectors.partitioningBy(s -> s.matches(".*[aeiouAEIUO].*")))
                .forEach((k, v) -> {
                    System.out.println(k ? "Vowels" : "Non-vowels");
                    System.out.println(v);
                        }
                );


    }
}
