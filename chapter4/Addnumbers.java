package chapter4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Addnumbers {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in); // We initialize the Scanner class outside the loop.
        boolean again;
        do {
            System.out.println("Enter the first number"); // We use the Scanner class inside this block {do} of code.
            double num1 = sc.nextDouble();                // All these statements will be executed at least once before we prompt the user.
            System.out.println("Enter the second number");
            double num2 = sc.nextDouble();
            double sum = num1 + num2;

            System.out.println("The sum is " + sum );

            System.out.println("Would you like to start over?");
            again = sc.nextBoolean(); // This condition is tested after the loop

        } while(again);

        sc.close();

    }
}
