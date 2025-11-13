package ShristiAcademy.Arrays;
import java.util.*;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int size = arr1.length + arr2 .length;
        int[] results = new int[size];
        int index = 0;
        int lptr = 0;
        int rptr = 0;

        while(lptr < arr1.length && rptr < arr2.length){
            if(arr1[lptr] < arr2[rptr]){
                results[index] = arr1[lptr];
                lptr++;
            }else{
                results[index] = arr2[rptr];
                rptr++;
            }
            index++;
        }

        while(lptr < arr1.length){
            results[index++] = arr1[lptr++];
        }

        while(rptr < arr2.length){
            results[index++] = arr2[rptr++];
        }

        System.out.println("The First Array is : " +Arrays.toString(arr1) + " And Second Array is " +Arrays.toString(arr2));
        System.out.println("The result array is " +Arrays.toString(results));

    }
}
