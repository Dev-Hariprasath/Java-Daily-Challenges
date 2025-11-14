package FAANGChallenge.Array;

import java.util.ArrayList;

public class GreaterOnRightSide {
    static int getMax(int[] arr, int start){
        int max = arr[start];

        while(start < arr.length){
            if(arr[start] > max){
                max = arr[start];
            }
            start++;
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> l = new ArrayList<>();

        for(int i = 0; i < arr.length - 1; i++){
            int val = getMax(arr, i + 1);
            l.add(val);
        }

        l.add(-1);
        System.out.println(l);
    }
}
