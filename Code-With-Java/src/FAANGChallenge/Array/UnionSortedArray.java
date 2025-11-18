package FAANGChallenge.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class UnionSortedArray {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> union = Arrays.stream(a)
                .boxed()
                .distinct()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));

        for(int n : b){
            if(!union.contains(n)){
                union.add(n);
            }
        }

        Collections.sort(union);

        return union;
    }
}
