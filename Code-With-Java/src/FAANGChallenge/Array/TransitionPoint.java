package FAANGChallenge.Array;

public class TransitionPoint {
    int transitionPoint(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) return i;
        }
        return -1;
    }
}
