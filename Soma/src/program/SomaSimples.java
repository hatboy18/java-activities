package program;
import java.util.Scanner;

public class SomaSimples {
   public static void main(String[] args){
      int x,y,z;

      Scanner sc = new Scanner(System.in);

      x = sc.nextInt();
      y = sc.nextInt();
      z = x + y;
      sc.close();
      System.out.println("O resultado da soma é: " + z);

   }
} 