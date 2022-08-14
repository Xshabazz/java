//Date
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
public class RollOrFlipTest {

    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        Random ex = new Random();
        CoinFlip cf = new CoinFlip();

        char resultChar;
        String resultString;
        boolean resultBoolean;
        int resultInteger;

        resultString = JOptionPane.showInputDialog("Do you want to flip a coin or roll a dice ? ");
        resultString = resultString.toUpperCase();
        resultChar = resultString.charAt(0);
        cf.flip(ex.nextBoolean());
        cf.roll(ex.nextInt(5)+1);
        if(resultChar == 'F'){System.out.println(cf.getCF());}


        else if(resultChar == 'C'){System.out.println(cf.getCF());}


        else if(resultChar == 'R'){System.out.println(cf.getRoll());}


        else if(resultChar == 'D'){System.out.println(cf.getRoll());}


        else{System.out.println("Invalid Input");}
        
        System.exit(0);
    }
}