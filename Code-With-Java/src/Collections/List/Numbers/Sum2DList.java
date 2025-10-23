package Collections.List.Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sum2DList {
    public static void main(String[] args) {
        List<List<Integer>> nums = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList( 4, 5, 7),
                Arrays.asList(8, 9, 6));

        int sum = nums.stream()
                .flatMap(s -> s.stream())
                .collect(Collectors.summingInt(e -> e));

        System.out.println("The sum of " + nums + " is " +sum);
    }
}
