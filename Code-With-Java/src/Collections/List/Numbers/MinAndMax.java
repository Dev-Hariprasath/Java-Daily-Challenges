package Collections.List.Numbers;

import java.util.Arrays;
import java.util.List;


public class MinAndMax {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,7,8,9,6);

        int Maximum = nums.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();

        int Minimum = nums.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();

        System.out.println("The Maximum " + Maximum + " and Minimum " + Minimum);
    }
}
