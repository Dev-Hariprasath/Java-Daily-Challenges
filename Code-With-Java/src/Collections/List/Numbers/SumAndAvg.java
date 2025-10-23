package Collections.List.Numbers;

import java.util.Arrays;
import java.util.List;

public class SumAndAvg {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,7,8,9,6);

        int sum = nums.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double avg = nums.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        System.out.println("The Sum is " + sum + " And Average is " +avg);
    }
}
