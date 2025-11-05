package Strings;

import java.util.Arrays;

public class FindLength {
    public static void main(String[] args) {
        String str = "hari prasath";

        Long length = str.chars()
                .mapToObj(c -> (char) c)
                .count();

        System.out.println("Length using custom method " +length);
    }
}
