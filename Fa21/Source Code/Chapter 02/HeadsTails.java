// 07/25/2022 Darien Shabazz 
//This program flips a coin 6 times 
import java.util.Random;
public class HeadsTails
{
   public static void main(String[] args)
   {
      Random random = new Random();
      boolean coin;

      coin = random.nextBoolean();

      if (coin==true){
         System.out.println("\nHeads");
      }
      else if (coin==false){
         System.out.println("\nTails");
      }

      coin = random.nextBoolean();

      if (coin==true){
         System.out.println("\nHeads");
      }
      else if (coin==false){
         System.out.println("\nTails");
      }

      coin = random.nextBoolean();

      if (coin==true){
         System.out.println("\nHeads");
      }
      else if (coin==false){
         System.out.println("\nTails");
      }

      coin = random.nextBoolean();

      if (coin==true){
         System.out.println("\nHeads");
      }
      else if (coin==false){
         System.out.println("\nTails");
      }

      coin = random.nextBoolean();

      if (coin==true){
         System.out.println("\nHeads");
      }
      else if (coin==false){
         System.out.println("\nTails");
      }

      coin = random.nextBoolean();

      if (coin==true){
         System.out.println("\nHeads");
      }
      else if (coin==false){
         System.out.println("\nTails");
      }
      System.out.println("\nThe probability of flipping 6 Heads is 1/"+Math.pow(2.0,6.0)+"\n");
   }
}
