package chapter3;
/*
If Statement.
All salespersons get a payment of $1000 a week.
Salespersons who exceed 10 sales get an adittional bonus of $250.
 */

import java.util.Scanner;

public class ExerciseChapter3 {
    public static void main(String[]args){
        int salary = 1000;
        int bonus = 250;
        int quote = 10;

     Scanner sc = new Scanner(System.in);
     System.out.println("How many sales did the employee make this week");
     int sales = sc.nextInt();
     sc.close();

     if(sales > quote){
         salary = salary + bonus;
         System.out.println("The final payment for the saleperson was $" + salary);
     } else {
         System.out.println("The final payment for the saleperson was $" + salary);

     }

    }
}
