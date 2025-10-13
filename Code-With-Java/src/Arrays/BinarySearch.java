package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 13, 16, 24, 33};
        int target = 8;
        int left = 0;
        int right = arr.length - 1;;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                System.out.println("The index is " +mid);
                break;
            }
            if(arr[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }
}
