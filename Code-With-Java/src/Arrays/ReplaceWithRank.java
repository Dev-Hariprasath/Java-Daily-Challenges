package Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReplaceWithRank {
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 5, 3, 2, 1, 6, 7, 2};

        Map<Long, Long> frq = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Frequency List : ");
        frq.forEach((k, v ) -> System.out.println(k + " - " + v));

        for(int i = 0; i < arr.length; i++){
            Long rank = frq.get(arr[i]);
            arr[i] = rank;
        }

        System.out.println("Rank of Array : ");
        System.out.println(Arrays.toString(arr));
    }
}
