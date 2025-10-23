package Collections.List.Numbers;

import java.util.Arrays;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,7,8,2,3,4,5,9,6);
        nums.stream()
                .distinct()
                .forEach(System.out::println);

    }
}
