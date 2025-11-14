package FAANGChallenge.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2};
        Arrays.stream(arr)
                .mapToObj(Integer::valueOf)
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
