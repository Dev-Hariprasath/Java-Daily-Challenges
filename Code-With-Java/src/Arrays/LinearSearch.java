package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 8, 11, 9, 2};
        int target = 2;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Element is found at " +i);
            }
        }
    }
}
