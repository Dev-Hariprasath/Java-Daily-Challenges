package ShristiAcademy.Arrays;

import java.util.Arrays;

public class Adding {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum = Arrays.stream(arr)
                .boxed()
                .mapToDouble(e -> e).sum();
        System.out.println("The Sum of all elements is " +sum);

    }
}
