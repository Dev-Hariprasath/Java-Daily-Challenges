package Arrays;

public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 31, 4, 5, 6, 71};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int n : arr){
            if(max < n){
                secondMax = max;
                max = n;
            } else if (secondMax < n) {
                secondMax = n;
            }
        }

        System.out.println("The Second Maximum Is " +secondMax);
    }
}
