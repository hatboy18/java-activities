import java.util.Scanner;

public class Fatorial {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      for(int i = 0;i<=n ;i++ ) {
          int mult = i * n;
          int fact = mult * i;
          System.out.println(fact);
      }

   }
}