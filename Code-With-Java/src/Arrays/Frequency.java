package Arrays;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {5, 2, 13, 7, 2, 10, 16, 12, 7, 6};
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach( (k, v) ->
                        System.out.println("The key is " + k + " Frequency is " +v)
                );
    }
}
