package ShristiAcademy.Strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMap {
    public static void main(String[] args) {
        String str = "babacccdefadfe";
        Map<Character, Integer> frq = new HashMap<>();

        for(char ch : str.toCharArray()){
            frq.put(ch, frq.getOrDefault(ch, 0) + 1);
        }

        System.out.println("Key -  Frequency");
        for(char c : frq.keySet()){
            System.out.println(c +" - "+ frq.get(c));
        }
    }
}
