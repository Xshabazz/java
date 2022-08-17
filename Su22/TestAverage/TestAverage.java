//Date: 8/13/2022
//Author: Darien Shabazz
import java.util.Scanner;
/*- This program asks the user for three test scores, passes them to a Classy  
//  class object and returns the scores, average score, and grade,
//  if the average score is between 0 and 100, it then displays the results.  - */

public class TestAverage {

    public static void main(String[] args)  {
        double one, two, three; // test scores 
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is the score of test 1 ?");
        one = keyboard.nextDouble();
        System.out.println("What is the score of test 2 ?");
        two = keyboard.nextDouble();
        System.out.println("What is the score of test 3 ?");
        three = keyboard.nextDouble();

        TestAverageClass exOne = new TestAverageClass(one, two, three);//pass the input values to a Classy object
        char grade = exOne.getGrade();//store grade for switch cases 
        double average = exOne.getAverage();//store the average score here so it can be tested for validity
        if (average>0&&average<100)
        {        
            System.out.println("\nTest 1 score : "+exOne.getTestOne());
            System.out.println("Test 2 score : "+exOne.getTestTwo());
            System.out.println("Test 3 score : "+exOne.getTestThree());
            System.out.printf("Average score : %.2f%%\n",exOne.getAverage());//format the average score
            System.out.println("Grade : "+grade);    

            switch (grade)//display a different exclamation based on the grade
            {
                case 'A':
                    System.out.println("Excellent job! ");
                    break;  
                case 'B':
                    System.out.println("Good job! ");
                    break;  
                case 'C':
                    System.out.println("Better luck next time! ");
                    break;  
                case 'D':
                    System.out.println("Study more next time. ");
                    break;  
                case 'F':
                    System.out.println("You need to study more. ");
                    break;  
            }
        }
        else //if the average score is not between 0 and 100, there is a user input error
            System.out.println("Error. Try again. ");

    }
}