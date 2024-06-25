package main;

import java.util.Scanner;

import ret.Retangulo;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo obj;
		
		obj = new Retangulo();
		
		System.out.println("Digite a altura do Retangulo: ");
		obj.height = sc.nextDouble();
		System.out.println("Digite a largura do Retangulo: ");
		obj.width = sc.nextDouble();
		
		double areaObj = obj.area();
		double perimeterObj = obj.perimetro();
		double diagonalObj = obj.diagonal();
		
		
		System.out.printf("A area do Retangulo é: %.2f%n", areaObj);
		System.out.printf("O perimetro do Retangulo é: %.2f%n", perimeterObj);
		System.out.printf("A diagonal do Retangulo é: %.2f%n", diagonalObj);
		sc.close();
	}
}
