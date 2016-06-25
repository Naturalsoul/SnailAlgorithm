package SnailAlgorithm.snail;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Here is the algorithm. We catch the numbers and then do all the operations.
 */
public class Snail {
    private int[] numbers;

    public Snail (int[] numbers) { this.numbers = numbers; }

    public int[] sortNumbers() {
        Arrays.sort(numbers);
        return numbers;
    }

    public int[][] doSnail() {
        int[][] snail = new int[5][5];
        int p = 0;

        // [1, 2, 3, 4 ,5]

        for (int c = 0; c < 5; c++) {
            snail[0][c] = numbers[p];
            p++;
        }

        // [6, 7, 8, 9]

        for (int r = 1; r < 4; r++) {
            snail[r][4] = numbers[p];
            p++;
        }

        // [10, 11, 12, 13]

        for (int c = 3; c >= 0; c--) {
            snail[4][c] = numbers[p];
            p++;
        }

        // [14, 15, 16]

        for (int r = 3; r > 0; r--) {
            snail[r][0] = numbers[p];
            p++;
        }

        // [17, 18, 19]

        for (int c = 1; c < 4; c++) {
            snail[1][c] = numbers[p];
            p++;
        }

        // [20, 21]

        for (int r = 2; r < 4; r++) {
            snail[r][3] = numbers[p];
            p++;
        }

        // [22, 23]

        for (int c = 2; c > 0; c--) {
            snail[3][c] = numbers[p];
            p++;
        }

        // [24]

        snail[2][1] = numbers[p];
        p++;

        // [25]

        snail[2][2] = numbers[p];

        return snail;
    }
}
