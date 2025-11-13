package ShristiAcademy.Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 5, 3, 2, 1};

        Map<Integer, Long> frq = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.print("The Repeating Elements is - ");

        for(int n : frq.keySet()){
            if(frq.get(n) >= 2){
                System.out.print(n + " ");
            }
        }
    }
}
