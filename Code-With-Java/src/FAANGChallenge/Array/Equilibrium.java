package FAANGChallenge.Array;

public class Equilibrium {
        public static int findEquilibrium(int arr[]) {
            int total = 0;
            for (int n : arr) total += n;

            int leftSum = 0;

            for (int i = 0; i < arr.length; i++) {
                total -= arr[i]; // now total is right sum

                if (leftSum == total) {
                    return i;
                }

                leftSum += arr[i];
            }

            return -1;
        }
}
