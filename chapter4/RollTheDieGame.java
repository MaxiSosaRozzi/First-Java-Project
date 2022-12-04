package chapter4;

import java.sql.SQLOutput;
import java.util.Random;

public class RollTheDieGame {
    public static void main(String args[]){

        // Variables

        int totalSpaces = 20;
        int dieRolls = 5;
        int advance = 0;
        Random random = new Random();

        System.out.println(" Let the game begins ");
        System.out.println("----------------------");


        for(int i=1;i <= dieRolls; i++) {
            // Rolling the die for the Player

            int die = random.nextInt(6) + 1;
            // How much the player has advanced
            System.out.println("Rolling the die number #" + (i) +"...");
            System.out.println("Result: " + die);
            advance = advance + die;
            System.out.println("The player's in the space " + advance);
            System.out.println("----------------------");
            if(advance == totalSpaces){
                System.out.println("Player gets exactly to the space number  #" + advance + ", MAXI HAS WON!");
                break;
            }else if (i == dieRolls && advance<totalSpaces){
                System.out.println("The player's in the space number #" + advance + ", It needed to advance " + (totalSpaces - advance) + " more spaces to win!");
                System.out.println("----------------------------------------------------------------------------------------------");
                break;
            }else if(advance>totalSpaces) {
                System.out.println("The player advanced to the space number #" + advance + ". " + (advance - totalSpaces) + " spaces extra. Sorry");
            break;
            }
        }
        System.out.println("Good game! Thank you");


        }
        }


