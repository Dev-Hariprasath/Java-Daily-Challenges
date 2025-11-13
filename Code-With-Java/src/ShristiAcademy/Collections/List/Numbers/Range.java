package ShristiAcademy.Collections.List.Numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Range {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,7,8,9,6);
        IntStream.range(0, 5)
                .forEach(n -> System.out.println(nums.get(n)));
    }
}
