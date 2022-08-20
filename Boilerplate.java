//Date: 8/x/2022
//Author: Darien Shabazz
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;
import java.io.*;
public class Boilerplate {

    public static void main(String[] args)  {
        double one, two, three; // test scores 
        
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        try{
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("/Users/darien/repos/java/Su22/Files/output-copy.txt"));
            BufferedReader br = new BufferedReader(
                new FileReader("/Users/darien/repos/java/Su22/Files/output.txt"));
                String s;
                while ((s = br.readLine())!=null){
                    bw.write(s+"\n");
                }
                bw.close();
        }catch(Exception exOne){
            return;
        }
        

    }
}