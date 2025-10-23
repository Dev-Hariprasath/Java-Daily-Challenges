package Collections.List.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FrequencySquare {
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Map<Integer, Integer> frq = new HashMap<>();

        for(int num : n){
            if(!frq.containsKey(num)){
                frq.put(num, num * num);
            }
        }

        frq.forEach((k, v) -> System.out.println("The key is " + k + " & Square value is " +v));
    }
}
