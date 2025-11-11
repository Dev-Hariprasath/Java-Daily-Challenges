package GfgChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ElementMoreThanN {
        public ArrayList<Integer> findMajority(int[] arr) {
            Map<Integer, Integer> frq = new HashMap<>();
            ArrayList<Integer> res = new ArrayList<>();
            int m = arr.length / 3;

            for(int n : arr){
                frq.put(n, frq.getOrDefault(n, 0) + 1);
            }

            for(int n : frq.keySet()){
                if(frq.get(n) > m){
                    res.add(n);
                }
            }

            Collections.sort(res);
            return res;
        }
}
