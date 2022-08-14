//8/13/2022
//Darien Shabazz
import java.util.Scanner;

public class TimeCalculator {

    public static void main(String[] args)  {
        
        Scanner keyboard = new Scanner(System.in);
        Random ex = new Random();

        int days = 0,
                hours = 0,
                minutes = 0,
                seconds = 0,
                fseconds = 0;
//
        System.out.println("enter the number of seconds");
        seconds = keyboard.nextInt();

        if (seconds<0)
        {
            System.out.println("Invalid input, Try again.");
        }
        else if (seconds<60)
        {
            days = 0;
            hours = 0;
            minutes = 0;
            fseconds = seconds;
        }
        else if (seconds<3600)
        {
            minutes = (seconds/60);
            fseconds = seconds%60;
        }
        else if (seconds<86400)
        {
            hours = (seconds/3600);
            minutes = (seconds-(hours*3600))/60;
            fseconds = seconds%60;
        }
        else if(seconds>86400)
        {
            days = seconds / 86400;
            hours = (seconds-(days*86400))/3600;
            minutes = (seconds-(days*86400)-(hours*3600))/60;
            fseconds = seconds%60; 
        }
        else System.out.println("Invalid input, try again");
        System.out.printf("%,d Seconds = %d Days, %d Hours, %d Minutes, and %d Seconds."
                        , seconds, days, hours, minutes, fseconds );
        

    }
}