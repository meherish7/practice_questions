package arrays;

import java.util.Scanner;

public class Evenoddd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) { // The modulo operator (%) gives the remainder of a division
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        input.close();
    }
}