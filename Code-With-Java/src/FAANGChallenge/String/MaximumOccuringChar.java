package FAANGChallenge.String;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuringChar {
        public char getMaxOccuringChar(String s) {

            Map<Character, Integer> frq = new HashMap<>();

            for(char ch : s.toCharArray()){
                frq.put(ch, frq.getOrDefault(ch, 0) + 1);
            }

            char c = s.charAt(0);
            int max = frq.get(c);

            for(char ch : s.toCharArray()){
                int count = frq.get(ch);
                if(max < count || (count == max && ch < c)){
                    max = count;
                    c = ch;
                }
            }

            return c;
        }
}
