package ShristiAcademy.Collections.List.Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,7,8,9,1,6,4,9,6,4,3,2,7,7);

        nums.stream()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .forEach((k, v)
                        -> System.out.println("The key is " + k + " & Frequency is " +v));


    }
}
