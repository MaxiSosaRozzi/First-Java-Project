package chapter4;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String args[]){
        // Known variables
        int rate = 15;
        int maxHours = 40;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many hours did you work this week?");
        double hoursWorked = sc.nextDouble();

        // Validate input

        while(maxHours < hoursWorked){
            System.out.println("Invalid Entry. Yours hours must be between 1 and 40 man. Try again.");
            hoursWorked = sc.nextDouble(); // Sentinel (ceninela) --> Action to exit the loop.
        }
        sc.close();

        double gross = rate * hoursWorked;
        System.out.println("Gross pay is: $" + gross);

        }


    }

