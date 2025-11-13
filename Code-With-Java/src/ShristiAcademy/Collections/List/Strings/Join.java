package ShristiAcademy.Collections.List.Strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Join {
    public static void main(String[] args) {
        List<String> st = Arrays.asList("hari", "prasath", "ganesh", "ram", "mogan");

       String str =  st.stream()
                .collect(Collectors.joining(", "));

        System.out.println("The Join String is " +str);
    }
}
