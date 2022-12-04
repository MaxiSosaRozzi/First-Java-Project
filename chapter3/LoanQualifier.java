package chapter3;

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String args[]){
        // Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;


        // Get what we don't
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Enter the number of years with your current employer");
        double years = scanner.nextDouble();
        scanner.close();



        //Make the decision
        if (salary >= requiredSalary){
            if (years >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the loan. Hope you don't waste it in beers");
            } else {
                System.out.println("We're sorry, you don't qualify for the loan because you must have worked at your current job for at least " + requiredYearsEmployed + " years");

            }

        } else {
            System.out.println("Sorry, you must earn at least $" + requiredSalary );

        }

    }
}
