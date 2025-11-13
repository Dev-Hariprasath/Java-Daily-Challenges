package ShristiAcademy.Arrays;

public class Minimum {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11, 34, 2, 67, 13, 94};
        int min = Integer.MAX_VALUE;

        for(int n : arr){
            if(n < min){
                min = n;
            }
        }

        System.out.println("The Minimum Value is " +min);

    }
}
