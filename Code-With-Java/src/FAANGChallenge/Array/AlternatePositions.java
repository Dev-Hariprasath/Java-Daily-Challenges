package FAANGChallenge.Array;

import java.util.ArrayList;

public class AlternatePositions {
        void rearrange(ArrayList<Integer> arr) {
            ArrayList<Integer> pos = new ArrayList<>();
            ArrayList<Integer> neg = new ArrayList<>();

            for (int x : arr) {
                if (x >= 0) pos.add(x);
                else neg.add(x);
            }

            int i = 0, p = 0, n = 0;
            boolean turnPositive = true;

            while (i < arr.size()) {
                if (turnPositive) {
                    if (p < pos.size()) arr.set(i, pos.get(p++));
                    else arr.set(i, neg.get(n++)); // no positives left
                } else {
                    if (n < neg.size()) arr.set(i, neg.get(n++));
                    else arr.set(i, pos.get(p++)); // no negatives left
                }
                turnPositive = !turnPositive;
                i++;
            }
        }
}
