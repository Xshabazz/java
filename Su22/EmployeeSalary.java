import java.util.Scanner;
import javax.swing.JOptionPane;

public class EmployeeSalary {

    public static void main(String[] args)   {

        String stringOne,
                stringTwo,
                stringThree,
                stringFour,
                stringFive,
                stringSix;
        float floatOne = 0.0F,
                floatTwo = 0.0F,
                floatThree = 0.0F,
                floatFour = 0.0F,
                floatFive = 0.0F,
                floatSix = 0.0F;
        final double MONTHS = 12.0;

//collect employee names and monthly wages
        //employee 1
        stringOne = JOptionPane.showInputDialog("Enter employee 1 name");
        floatOne = Float.parseFloat(JOptionPane.showInputDialog("Enter employee 1 monthly salary"));

        //employee 2
        stringTwo = JOptionPane.showInputDialog("Enter employee 2 name");
        floatTwo = Float.parseFloat(JOptionPane.showInputDialog("Enter employee 2 monthly pay."));

        //employee 3 
        stringThree = JOptionPane.showInputDialog("Enter employee 3 name");
        floatThree = Float.parseFloat(JOptionPane.showInputDialog("Enter employee 3 monthly pay."));

        //employee 4
        stringFour = JOptionPane.showInputDialog("Enter employee 4 name");
        floatFour = Float.parseFloat(JOptionPane.showInputDialog("Enter employee 4 monthly pay."));

        //employee 5 
        stringFive = JOptionPane.showInputDialog("Enter employee 5 name");
        floatFive = Float.parseFloat(JOptionPane.showInputDialog("Enter employee 5 monthly pay."));

        //employee 6 
        stringSix = JOptionPane.showInputDialog("Enter employee 6 name");
        floatSix = Float.parseFloat(JOptionPane.showInputDialog("Enter employee 6 monthly pay."));
        //multiply employee monthly salary by final constant double decimal
        floatOne *= (float)(MONTHS);
        floatTwo *= (float)(MONTHS); 
        floatThree *= (float)(MONTHS);
        floatFour *= (float)(MONTHS);
        floatFive *= (float)(MONTHS);
        floatSix *= (float)(MONTHS);

System.out.print("\n\n");
        //display results in currency format 
        System.out.printf(stringOne +"'s salary"+" = $%-,8.2f\n",floatOne);
        System.out.printf(stringTwo +"'s salary"+" = $%-,8.2f\n",floatTwo);
        System.out.printf(stringThree +"'s salary"+" = $%-,8.2f\n",floatThree);
        System.out.printf(stringFour +"'s salary"+" = $%-,8.2f\n",floatFour);
        System.out.printf(stringFive +"'s salary"+" = $%-,8.2f\n",floatFive);
        System.out.printf(stringSix +"'s salary"+" = $%-,8.2f\n",floatSix);
        //tell program to stop executing (JOPtionPane)
        System.exit(0);

    }
}