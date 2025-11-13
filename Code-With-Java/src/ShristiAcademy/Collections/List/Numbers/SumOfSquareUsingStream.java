package ShristiAcademy.Collections.List.Numbers;

import java.util.Arrays;
import java.util.List;

public class SumOfSquareUsingStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,7,8,9,6);

        int sum = nums.stream()
                .map(n -> n * n)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("The sum of all squares is " +sum);
    }
}
