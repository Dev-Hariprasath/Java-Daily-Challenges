package Collections.List.Numbers;

import java.util.Arrays;
import java.util.List;

public class SecondMinAndMax {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,7,8,9);

        int secondMin = nums.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .get();

        int secondMax = nums.stream()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .get();

        System.out.println("The second Maximum " + secondMax + " And Minimum is " + secondMin);
    }
}
