package ShristiAcademy.Arrays;

import java.util.Arrays;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 1, 4, 5, 9};
        Arrays.stream(arr)
                .boxed()
                .distinct()
                .forEach(System.out::println);
    }
}
