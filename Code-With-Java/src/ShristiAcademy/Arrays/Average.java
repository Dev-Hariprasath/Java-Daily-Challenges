package ShristiAcademy.Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Average {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double avg = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.averagingDouble(e -> e));

        System.out.println("The Average is " + avg);
    }
}
