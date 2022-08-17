//Date
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class PersonalInformationTest {

    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        String name, address;
        byte age;
        long number = 0L;

        PersonalInformation ex = new PersonalInformation();
        System.out.println("What is your address ? ");
        ex.setAddress(keyboard.nextLine());
        System.out.println("What is your Name ? ");
        ex.setName(keyboard.nextLine());
        System.out.println("What is your Age ? ");
        ex.setAge(keyboard.nextByte());
        System.out.println("What is your Phone Number ? ");
        ex.setNumber(keyboard.nextLong());
        
        PersonalInformation exOne = new PersonalInformation();
        System.out.println("What is your address ? ");
        keyboard.nextLine();
        exOne.setAddress(keyboard.nextLine());
        System.out.println("What is your Name ? ");
        exOne.setName(keyboard.nextLine());
        System.out.println("What is your Age ? ");
        exOne.setAge(keyboard.nextByte());
        System.out.println("What is your Phone Number ? ");
        exOne.setNumber(keyboard.nextLong());

        PersonalInformation exTwo = new PersonalInformation();
        System.out.println("What is your address ? ");
        keyboard.nextLine();
        exTwo.setAddress(keyboard.nextLine());
        System.out.println("What is your Name ? ");
        exTwo.setName(keyboard.nextLine());
        System.out.println("What is your Age ? ");
        exTwo.setAge(keyboard.nextByte());
        System.out.println("What is your Phone Number ? ");
        exTwo.setNumber(keyboard.nextLong());

//display output with formatting

String colOne = "Name :", 
        colTwo = "Address :", 
        colThree = "Age :", 
        colFour = "Number: ",
        divBar = "-----------------------------------------------------------------";

        System.out.printf("|%-15s|%-15s|%-15s|%-15s|\n",colOne,colTwo,colThree,colFour);
        System.out.print(divBar+"\n");
        System.out.printf("|%-15s|%-15s|%-15d|%-15d|\n",ex.getName(),ex.getAddress(),ex.getAge(),ex.getNumber());
        System.out.print(divBar+"\n");
        System.out.printf("|%-15s|%-15s|%-15d|%-15d|\n",exOne.getName(),exOne.getAddress(),exOne.getAge(),exOne.getNumber());
        System.out.print(divBar+"\n");
        System.out.printf("|%-15s|%-15s|%-15d|%-15d|\n",exTwo.getName(),exTwo.getAddress(),exTwo.getAge(),exTwo.getNumber());
        System.out.print(divBar+"\n");
  

            }
    }