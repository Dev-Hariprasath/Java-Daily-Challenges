package ShristiAcademy.Collections.List.Numbers;

import java.util.List;
import java.util.stream.Collectors;

public class GroupEvenOrOdd {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        nums.stream()
                .collect(Collectors.partitioningBy(e -> e % 2 == 0))
                .forEach((k, v) -> {
                    System.out.println(k ? "Even" : "Odd");
                    System.out.println(v);
                });
    }
}
