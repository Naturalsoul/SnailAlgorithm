package SnailAlgorithm;

import SnailAlgorithm.snail.Snail;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The Snail Algorithm is about something like a circle. Here I take a list of disorganized numbers
 * to organize them and create the snail. You can look here to realize what i'm doing: https://goo.gl/VBMhVN
 */
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner reader = new Scanner(System.in);
            int option;

            menu();

            try {
                option = reader.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("\nJust numbers, pls.\n");
                continue;
            }

            if (option < 1 || option > 2 && option < 9 || option > 9) {
                System.out.println("\nInvalid option.\n");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.println("\nGreat! These are the numbers that we'll use: ");
                    System.out.println("10 2 5 3 13 25 7 6 1 12 24 15 21 20 4 8 16 22 18 23 14 17 11 9 19\n");
                    System.out.println("It's the sequence from 1 to 25 in a disorganized way.");
                    System.out.println("Let's see how this works!! :D\n");
                    System.out.println("First, we need to organize the numbers:");

                    int[] numbers = new int[]{10, 2, 5, 3, 13, 25, 7, 6, 1, 12, 24, 15, 21, 20, 4, 8, 16, 22, 18, 23, 14, 17, 11, 9, 19};

                    Snail snail = new Snail(numbers);

                    System.out.println(Arrays.toString(snail.sortNumbers()));

                    System.out.println("\nThen, we created the Snail:");
                    int[][] arr = snail.doSnail();

                    for (int i = 0; i < 5; i++) {
                        for (int k = 0; k < 5; k++) {
                            System.out.print(arr[i][k] + "\t");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                    break;

                case 9:
                    System.out.println("\nBye Bye!! ;)");
                    System.exit(0);
            }
        }
    }

    private static void menu() {
        System.out.println("--------------------");
        System.out.println("Hey!! Tell me, what do u want?");
        System.out.println("1) Show me how this works.");
        System.out.println("9) That was awesome :D! Thanks!!. See ya later!");
        System.out.println("--------------------");
        System.out.print("Choose an option: ");
    }
}
