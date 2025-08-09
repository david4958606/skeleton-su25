import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        int[] dice = new int[6];
        for (int i = 0; i < dice.length; i++) {
            dice[i] = i + 1;
        }
        return dice;
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        OptionalInt min = Arrays.stream(array).min();
        OptionalInt max = Arrays.stream(array).max();
        if (min.isPresent()) {
            return max.getAsInt() - min.getAsInt();
        }
        return 0;
    }

}
