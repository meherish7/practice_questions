package arrays;

import java.util.Scanner;

public class Factorialll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; 
            for (int i = 1; i <= number; ++i) {
                factorial *= i; 
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        input.close();
    }
}