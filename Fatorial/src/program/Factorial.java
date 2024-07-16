package program;

import java.util.Scanner;

public class Factorial {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
      for(int i = 0;i<=n ;i++ ) {
          int mult = i * n;
          int fact = mult * i;
          System.out.println(fact);
      }

   }
}