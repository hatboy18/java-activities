package program;


import java.util.Scanner;

public class ParOuImpar {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();

      for(int i = 0; i<x;i++) {
          if(i % 2 == 1) {
              System.out.println(i);
          }
      }
      sc.close();
   }
}