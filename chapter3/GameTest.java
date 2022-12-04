package chapter3;

import java.util.Scanner;

public class GameTest {
    public static void main(String args[]){
        /// DECLARED VARIABLES
        String p1;
        String p2;
        String result;

        /// INITIALIZED VARIABLES WITH AN INPUT.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1, rock, scissors or papper?");
        p1 = scanner.next();
        System.out.println("Player 2, rock, scissors or papper?");
        p2 = scanner.next();
        scanner.close();

        /// USED IF ELIF ELSE STATEMENTS
        if (p1.equals(p2)){
            System.out.println("It's a Draw hehe");
        }
        else if (p1.equals("rock") && p2.equals("scissors") || p1.equals("papper") && p2.equals("rock") || p1.equals("scissors") && p2.equals("papper"))  {
            System.out.println("Player 1 won!");
        } else {
            System.out.println("Player 2 won bitches!");
        }
        }
    }
