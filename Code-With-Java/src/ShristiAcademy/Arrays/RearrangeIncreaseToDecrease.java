package ShristiAcademy.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class RearrangeIncreaseToDecrease {
    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 4, 7, 2, 0, 6};

        Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.comparingInt(e -> (int) e).reversed())
                .forEach(System.out::print);
    }
}
