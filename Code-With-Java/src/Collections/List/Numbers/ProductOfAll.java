package Collections.List.Numbers;

import java.util.List;

public class ProductOfAll {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);

        int product = nums.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("The product of all elements in array is " +product);
    }
}
