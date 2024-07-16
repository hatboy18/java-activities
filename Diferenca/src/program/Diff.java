package program;
import java.util.Scanner;

public class Diff {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int a,b,c,d,diff;

      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();
      d = sc.nextInt();
      sc.close();
      diff = (a * b - c * d);
      System.out.println("A diferença é: " + diff);

   }
}