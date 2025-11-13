package ShristiAcademy.Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateUnsorted {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 1, 4, 7, 8, 2};

        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet())
                .forEach(System.out::print);
    }
}
