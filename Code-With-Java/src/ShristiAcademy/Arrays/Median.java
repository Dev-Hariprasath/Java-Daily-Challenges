package ShristiAcademy.Arrays;

public class Median {
    public static void main(String[] args) {
        int[] arr = new int[]{21,24,3,14,5,12,67,4,67};
        int n = arr.length;
        int index = n % 2 == 0 ? (n + 1) / 2 : ((n / 2) + ((n / 2) + 1)) / 2;
        System.out.println("The Median is " +arr[index]);

    }
}
