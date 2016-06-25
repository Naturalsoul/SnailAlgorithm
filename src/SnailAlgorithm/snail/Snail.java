package SnailAlgorithm.snail;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Here is the algorithm. We catch the numbers and then do all the operations.
 */
public class Snail {
    private ArrayList<Integer> numbers;

    public Snail (ArrayList<Integer> numbers) { this.numbers = numbers; }

    public ArrayList<Integer> sortNumbers() {
        int[] normalArray = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++)
            normalArray[i] = numbers.get(i);

        Arrays.sort(normalArray);
        numbers.clear();

        for (Integer num : normalArray) { numbers.add(num); }

        return numbers;
    }
}
