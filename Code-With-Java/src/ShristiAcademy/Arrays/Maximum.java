package ShristiAcademy.Arrays;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = new int[]{21,24,3,14,5,12,67,2,4,67};
        int max = Integer.MIN_VALUE;

        for(int n : arr){
            if(n > max){
                max = n;
            }
        }

        System.out.println("The Max value is " +max);
    }
}
