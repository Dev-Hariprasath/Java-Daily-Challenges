package Arrays;

public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {1, 7, 13, 34, 55, 26, 7, 18, 49};
        int target = 26;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] ==  target){
                System.out.println("The index of target " + target + " is " + i);
            }
        }
    }
}
