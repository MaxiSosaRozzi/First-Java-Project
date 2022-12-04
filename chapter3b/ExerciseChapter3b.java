package chapter3b;


import java.util.Scanner;

/* IF ELSE
 All salespeople are expected to make at least 10 sales each week.
 For those who do, they'll recieve a congratulations message
 For those who don't, they're informed of how many sales they were short.
 */
public class ExerciseChapter3b {
    public static void main(String Args[]){
        //Initialize values we know
        int quota = 10;

        // Get unknown values
        System.out.println("How many sales make the employee this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        // Make a decision on the path to take - Output
        if (sales >= quota){
            System.out.println("Congrats!");
        }
        else {
            int salesLeft = quota - sales;
            System.out.println(salesLeft + " sales left you needed to met your quota");
        }




    }


}
