package SnailAlgorithm;

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
                    break;

                case 9:
                    System.exit(0);
            }
        }
    }

    private static void menu() {
        System.out.println("--------------------");
        System.out.println("Hey!! Tell me, what do u want?");
        System.out.println("1) Show me how this works.");
        System.out.println("2) Let me try! I want to enter my own numbers.");
        System.out.println("9) That was awesome :D!. See ya later!");
        System.out.println("--------------------");
        System.out.print("Choose an option: ");
    }
}
