package chapter5;

import java.util.Scanner;

public class VariableScope {

     // GLOBAL VARIABLES & STUFF HERE

    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){

        double salary = getSalary(); // Variables declared (I get the values from the methods)
        int creditScore = getCreditScore();
        sc.close();
        boolean qualified = isUserQualified(creditScore, salary); // 1
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your Salary Max: ");
        double salary = sc.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your Credit Score dude: ");
        int creditScore = sc.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        } else{
            return false;
        }
    }
    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("The User has been approved!");
        } else{
            System.out.println("The User has been declined. Sorry");
        }

    }



}
