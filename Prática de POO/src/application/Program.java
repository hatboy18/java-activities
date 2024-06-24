package application;

import java.util.Scanner;

import entidades.Triangle;//importando a classe para ser ultilizada no código principal

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		
		//o comando new vai criar um novo objeto na váriavel x e y com instancia da classe Triangle
		x = new Triangle();
		y = new Triangle();
		
		//Aqui estou coletando cada atributo da classe Triangle e estou dando um valor pra elas com o objeto x e y;
		System.out.println("Digite o tamanho dos lados do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite o tamanho dos lados do triangulo y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle X area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior area: X");
			
		}else {
			System.out.println("Maior area: Y");
		}
		sc.close();
	}

}
