package Program;

import java.util.Scanner;

public class AreaCirculo {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      double x, y, res;

      y = 3.14159;

      x = sc.nextDouble();
      res = y * (Math.pow(x, 2));
      System.out.printf("A area do circulo é = %.4f%n", res);
      sc.close();

   }
}