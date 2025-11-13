package ShristiAcademy.Collections.List.Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,7,8,9,6);

        Optional<Integer> val = nums.stream()
                .filter(n -> n > 5)
                .findFirst();

        System.out.println("The first value greater than 5 is " +val.orElse(0));
    }
}
