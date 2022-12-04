package chapter5;

import java.util.Scanner;

public class Greeting {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = sc.next();
        System.out.print("Enter the first value ");
        int a = sc.nextInt();
        System.out.print("Enter the second value ");
        int b = sc.nextInt();

        greetUser(name);
        calculate(a,b);
        sc.close();

    }
    public static void greetUser(String name){
        System.out.println(" Hello " + name + "! Thank you bro. You kinda did it" );
    }
    public static int calculate(int a, int b){
        int value = a + b;
        System.out.println("The result was : " + value + " beers you're gonna drink tonight!");
        return value;
    }
}
