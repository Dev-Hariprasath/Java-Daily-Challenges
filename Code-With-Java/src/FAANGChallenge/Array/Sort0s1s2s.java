package FAANGChallenge.Array;

public class Sort0s1s2s {
        public void sort012(int[] arr) {
            int count0 = 0;
            int count1 = 0;
            int count2 = 0;

            for(int n : arr){
                if(n == 0) count0++;
                else if(n == 1) count1++;
                else count2++;
            }

            int i = 0;

            while(count0-- > 0) arr[i++] = 0;
            while(count1-- > 0) arr[i++] = 1;
            while(count2-- > 0) arr[i++] = 2;
        }
}
