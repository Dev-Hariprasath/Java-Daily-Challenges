package GfgChallenge.Array;

public class MoveAllZeroesToEnd {
    void pushZerosToEnd(int[] arr) {
        int index = 0;

        for(int n : arr){
            if(n != 0){
                arr[index++] = n;
            }
        }

        while(index < arr.length){
            arr[index++] = 0;
        }
    }
}
