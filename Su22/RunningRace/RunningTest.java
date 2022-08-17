//Date: 8/16/2022
//Author: Darien Shabazz
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RunningTest {

    public static void main(String[] args)  {
        double one, two, three; // test scores 
        double min, sec;
        String name;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of Runner :");
        name = keyboard.nextLine();
        System.out.println("Enter the minutes for Runner : ");
        min = keyboard.nextDouble();
        System.out.println("Enter the seconds for Runner : ");
        sec = keyboard.nextDouble();
        sec += (min*60);
        RunningRaceClass raceOne = new RunningRaceClass();
        raceOne.setR1(sec, name);

        System.out.println("Enter the name of Runner :");
        keyboard.nextLine();
        name = keyboard.nextLine();
        System.out.println("Enter the minutes for Runner : ");
        min = keyboard.nextDouble();
        System.out.println("Enter the seconds for Runner : ");
        sec = keyboard.nextDouble();
        sec += (min*60);
        raceOne.setR2(sec, name);

        System.out.println("Enter the name of Runner :");
        keyboard.nextLine();
        name = keyboard.nextLine();
        System.out.println("Enter the minutes for Runner : ");
        min = keyboard.nextDouble();
        System.out.println("Enter the seconds for Runner : ");
        sec = keyboard.nextDouble();
        sec += (min*60);
        
        raceOne.setR3(sec, name);

        raceOne.setPosition();
        
        String r1name = raceOne.getPositionOneName();
        double r1sec = raceOne.getPositionOneSeconds();
        String  r2name = raceOne.getPositionTwoName();
        double r2sec = raceOne.getPositionTwoSeconds();
        String r3name  = raceOne.getPositionThreeName();
        double r3sec = raceOne.getPositionThreeSeconds();

        System.out.println("Position 1  -  Name: "+r1name+". -  Time: "+r1sec);
        System.out.println("Position 2  -  Name: "+r2name+". -  Time: "+r2sec);
        System.out.println("Position 3  -  Name: "+r3name+". -  Time: "+r3sec);

    }
}