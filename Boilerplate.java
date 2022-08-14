//Date: 
//Author: Darien Shabazz
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class Boilerplate {

    public static void main(String[] args)  {
        double one, two, three; // test scores 
        
        Scanner keyboard = new Scanner(System.in);
        Random ex = new Random();


        System.out.println("What is the score of test 1 ?");
        one = keyboard.nextDouble();
        System.out.println("What is the score of test 2 ?");
        two = keyboard.nextDouble();
        System.out.println("What is the score of test 3 ?");
        three = keyboard.nextDouble();

        Classy exOne = new Classy(one, two, three);//pass the input values to a Classy object
        char grade = exOne.getGrade();
        double average = exOne.getAverage();
        if (average>0&&average<100)
        {        
            System.out.println("\nTest 1 score : "+exOne.getTestOne());
            System.out.println("Test 2 score : "+exOne.getTestTwo());
            System.out.println("Test 3 score : "+exOne.getTestThree());
            System.out.printf("Average score : %.2f%%\n",exOne.getAverage());
            System.out.println("Grade : "+grade);    

            switch (grade)
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
        else 
            System.out.println("Error. Try again. ");

    }
}