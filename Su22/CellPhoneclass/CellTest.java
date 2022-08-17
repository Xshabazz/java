//07/2022
import java.util.Scanner;
import javax.swing.JOptionPane;
public class CellTest {

    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        String man, model,
                colOne = "Manufacturer:",
                colTwo = "Model:", 
                colThree = "Price:";
        double price;
        //ask for the manufacturer name (man)
                //store the result in (model)
        System.out.println("What is the manufacturer ? :");
        man = keyboard.nextLine();
        //store the result in (man)
                //store the result in (model)
        System.out.println("What is the model ? :");
        model = keyboard.nextLine();
        //ask for the model name (model)
                //store the result in (model)
        System.out.println("What is the retail price ? : ");
        price = keyboard.nextDouble();
        //create CellPhone object and initialize it with the collected data 
        CellPhone ex = new CellPhone(man, model, price);
        //create a table 
        System.out.printf("%15s | %15s | %15s\n",colOne,colTwo,colThree);
        /*
        Display formatted results
        */
        System.out.printf("%15s | %15s | $%,15.2f\n"
                ,ex.getManufact(),ex.getModel(),ex.getPrice());
       
            }
    }