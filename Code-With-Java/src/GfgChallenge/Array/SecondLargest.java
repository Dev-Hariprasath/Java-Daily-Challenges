package GfgChallenge.Array;

public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int first_Max = Integer.MIN_VALUE;
        int second_Max = Integer.MIN_VALUE;

        for(int n : arr){
            if(n > first_Max){
                second_Max = first_Max;
                first_Max = n;
            }else if (n > second_Max && n != first_Max){
                second_Max = n;
            }
        }

        return second_Max == Integer.MIN_VALUE ? -1 : second_Max;
    }
}
