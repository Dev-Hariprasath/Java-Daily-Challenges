package GfgChallenge.Array;

import java.util.HashSet;

public class SmallestPositiveMissing {
        public int missingNumber(int[] arr) {

            HashSet<Integer> set = new HashSet<>();
            for(int n : arr){
                if(n > 0) set.add(n);
            }

            int minPositive = 1;

            while(set.contains(minPositive)){
                minPositive++;
            }

            return minPositive;

        }

}
