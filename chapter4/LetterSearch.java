package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String text = sc.next();
        sc.close();

        boolean letterFound = false;


        for(int i = 0; i < text.length();i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'X'|| currentLetter == 'x'){
                letterFound = true;
                break;
            }

        }

            if(letterFound==true){
                System.out.println("This text actually contains the letter 'X'");
            } else{
                System.out.println("This text doesn't contain the lettar 'X' in it");
            }




    }
}
