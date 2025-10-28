package Collections.List.Numbers;

import java.util.List;

public class SumOfSquaresUsingParallelStream {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);

        int sum = nums.parallelStream()
                .map(e -> e * e)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("The sum of Squares is " +sum);
    }
}
