package Arrays;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 9, 18, 6, 21, 11, 39, 5};

        System.out.println("The Unsorted Array " +Arrays.toString(arr));

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array : " +Arrays.toString(arr));
    }
}
