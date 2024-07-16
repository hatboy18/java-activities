package program;
import java.util.Scanner;

public class MediaPonderada {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      double a, b, c, media;
      
      for(int i = 0; i<n; i++) {
          a = sc.nextDouble();
          b = sc.nextDouble();
          c = sc.nextDouble();
          media = (a * 2 + b * 3 + c * 5)/11;
          System.out.printf("Media ponderada %.2f%n", media);
      }
      sc.close();
   }
} 
