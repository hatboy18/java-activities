import java.util.Scanner;

public class Formas {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      double a,b,c,pi,triangulo,circulo,trapezio,quadrado,retangulo;

      pi = 3.14159;

      a = sc.nextDouble();
      b = sc.nextDouble();
      c = sc.nextDouble();

      triangulo = a * c / 2;
      circulo = pi * (Math.pow(c, 2));
      trapezio = (a + b) * c / 2;
      quadrado = Math.pow(b, 2);
      retangulo = a * b;


      System.out.printf("A área do triângulo retângulo que tem A por base e C por altura: %.3f%n", triangulo);
      System.out.printf("A área do círculo de raio C: %.3f%n", circulo);
      System.out.printf("A área do trapézio que tem A e B por bases e C por altura: %.3f%n", trapezio);
      System.out.printf("A área do quadrado que tem lado B: %.3f%n", quadrado);
      System.out.printf("A área do retângulo que tem lados A e B: %.3f%n", retangulo);
   }
}