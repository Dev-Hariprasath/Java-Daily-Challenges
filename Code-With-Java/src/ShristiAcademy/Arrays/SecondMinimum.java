package ShristiAcademy.Arrays;

public class SecondMinimum {
    public static void main(String[] args) {
        int[] arr = {1, 21, 5, 46, 3, 11, 34, 8};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int n : arr){
            if(n < min){
                secondMin = min;
                min = n;
            } else if (secondMin > n) {
                secondMin = n;
            }
        }

        System.out.println("The second Max value is " +secondMin);
    }
}
