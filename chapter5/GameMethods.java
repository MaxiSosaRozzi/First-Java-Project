package chapter5;

/* Calculate the final total of someone's cell phone bill.

Allow the operator to input the plan fee and the number of overage minutes.

Charge the User 0.25 for every minute they were over their plan, and 15% tax on the subtotal.

Create separate methods to calculate the tax, overage fees, and final total.
Print the itemized bill.  */

import java.util.Scanner;

public class GameMethods {


    static double charge = 0.25;

    static Scanner sc = new Scanner(System.in);
    public static void main(String Args[]){

        double planFee = planFee();
        double overage = overageMinutes();
        sc.close();
        double overageFee = calculateOverageFees(overage);
        double subtotal = calculateSubtotal(planFee , overageFee);
        double taxes = getTaxes(subtotal);
        double total = getTotal(subtotal, taxes);

        printingItems(planFee,overageFee, subtotal, taxes, total);




    }
    public static double planFee(){
        System.out.print(" Enter your Plan Fee, please: ");
        double planFee = sc.nextDouble();
        return planFee;

    } // Asks for Plan fee
    public static double overageMinutes(){
        System.out.print(" Any overage minute: ");
         double overage = sc.nextDouble();
         return overage;
    } // Asks for the overage Minutes
    public static double calculateOverageFees(double overage){
        double overageFee = overage * charge;
        return overageFee;
    } // Calculates the Overage Fee.
    public static double calculateSubtotal(double planFee, double overageFee){
        double subtotal = (planFee + overageFee);
        return subtotal;
    }
    public static double getTaxes(double subtotal){
        double taxes = subtotal * 15 / 100;
        return taxes;
    }
    public static double getTotal(double subtotal, double taxes){
        double total = subtotal + taxes;
        return total;
    }
    public static void printingItems(double planFee, double overageFee,double subtotal,double taxes, double total){
        System.out.println("Hello my friend. I'll show you all the items of your cellphone bill. ");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Your Plan fee is: $" + planFee);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Your Overage Fee is: $" + overageFee);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("So dude, what you gotta pay is $" + subtotal + " plus $" + taxes + " of taxes. So it'd be $" + total + " GG WP MAX");
    }

}
