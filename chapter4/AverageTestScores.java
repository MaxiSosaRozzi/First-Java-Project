package chapter4;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String args[]){
        // Initialize what we do know
        int  numberOfstudents = 24;
        int numberOftest = 4;

        Scanner sc = new Scanner(System.in);





        // Process all students
        for(int i = 0; i < numberOfstudents; i++){

            double total = 0;
            for(int x = 0; x < numberOftest; x++){
                System.out.println("Enter the score for the test #" + (x+1)); // ATTENTION: the +1 is because it'd start as 1 instead of 0.
                double score = sc.nextDouble();
                total = total + score;
            }

            double testAverage = 0;
            testAverage = total / 4; // I hardcoded this...fuck... We should put the variable here (numberOfTest) instead of its value (4).

            System.out.println("The test average for student  #"+ (i+1) + " is " + testAverage);

        }

        sc.close();



    }
}
