package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String args[]){
        // Create a program that asks a user for a season of the year, then a whole number, then an adjetive.
        // Use and input to complete the sentence below then output the result:
        // "On a [adjetive] [season of the year] day, i drink a minimum of [whole number] cups of coffee."

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert season of the year ");
        String season = sc.nextLine();

        System.out.println("Insert a whole number: ");
        int whole_number = sc.nextInt();

        System.out.println("Insert an adj: ");
        Scanner adj = new Scanner(System.in);
        String adjetive = adj.nextLine();

        System.out.println("------------------------");
        System.out.println("On a " + adjetive + " " + season + " day, i drank a minimum of " + whole_number + " cups of Beers. ");




    }

}
