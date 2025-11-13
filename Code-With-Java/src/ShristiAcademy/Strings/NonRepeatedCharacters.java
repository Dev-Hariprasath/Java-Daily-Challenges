package ShristiAcademy.Strings;

public class NonRepeatedCharacters {
    public static void main(String[] args) {
        String st = "Hariprasath";
        st.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .forEach(System.out::println);
    }
}
