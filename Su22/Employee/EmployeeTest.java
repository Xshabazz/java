//Date: 8/3/2022
import java.util.Scanner;
import javax.swing.JOptionPane;
public class EmployeeTest {

    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        String colOne = "Employee Id:",
                colTwo ="Name:",
                colThree="Position:",
                colFour="Department:";

        String stringPasser,
                rowZero,
                rowOne,
                rowTwo,
                rowThree;
        int intPasser;
//employee 1 
        Employee empOne = new Employee();

        stringPasser = JOptionPane.showInputDialog("Enter the Employee name:"); //get employee name 
        empOne.setName(stringPasser); //setter

        stringPasser = JOptionPane.showInputDialog("Enter the Employee's department:"); //get employee department 
        empOne.setDepartment(stringPasser); //setter

        stringPasser = JOptionPane.showInputDialog("Enter the Employee's position:"); //get employee position 
        empOne.setPosition(stringPasser); //setter

        intPasser = Integer.parseInt
                (JOptionPane.showInputDialog("Enter employee id : ")); //get employee id 
        empOne.setEmployeeId(intPasser); //setter
//employee 2 
        Employee empTwo = new Employee();

        stringPasser = JOptionPane.showInputDialog("Enter the Employee name:"); //get employee name 
        empTwo.setName(stringPasser); //setter

        stringPasser = JOptionPane.showInputDialog("Enter the Employee's department:"); //get employee department 
        empTwo.setDepartment(stringPasser); //setter

        stringPasser = JOptionPane.showInputDialog("Enter the Employee's position:"); //get employee position 
        empTwo.setPosition(stringPasser); //setter

        intPasser = Integer.parseInt
                (JOptionPane.showInputDialog("Enter employee id : ")); //get employee id 
        empTwo.setEmployeeId(intPasser); //setter
//employee 3 
        Employee empThree = new Employee();

        stringPasser = JOptionPane.showInputDialog("Enter the Employee name:"); //get employee name 
        empThree.setName(stringPasser); //setter

        stringPasser = JOptionPane.showInputDialog("Enter the Employee's department:"); //get employee department 
        empThree.setDepartment(stringPasser); //setter

        stringPasser = JOptionPane.showInputDialog("Enter the Employee's position:"); //get employee position 
        empThree.setPosition(stringPasser); //setter

        intPasser = Integer.parseInt
                (JOptionPane.showInputDialog("Enter employee id : ")); //get employee id 
        empThree.setEmployeeId(intPasser); //setter



        rowZero = String.format("%15s|%15s|%15s|%15s",
        colOne,colTwo,colThree,colFour);
        rowOne = String.format("%15d|%15s|%15s|%15s",
        empOne.getEmployeeId(),empOne.getName(),empOne.getPosition(),empOne.getDepartment());
        rowTwo = String.format("%15d|%15s|%15s|%15s",
        empTwo.getEmployeeId(),empTwo.getName(),empTwo.getPosition(),empTwo.getDepartment());
        rowThree = String.format("%15d|%15s|%15s|%15s",
        empThree.getEmployeeId(),empThree.getName(),empThree.getPosition(),empThree.getDepartment());
        
        System.out.print(rowZero+"\n"
                            +rowOne+"\n"
                            +rowTwo+"\n"
                            +rowThree);
       
            }
    }