package ShristiAcademy.Strings;

import java.util.stream.Collectors;

public class RemoveWhitespace {
    public static void main(String[] args) {
        String str = "a   b   c d e f g h   i   j  k  l  m   ";
        String result = str.chars()
                .filter(ch -> !Character.isWhitespace((char) ch))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("Without Whitespace " +result);
    }
}
