package main;

import java.util.Scanner;

import product_info.Produto;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto x;
		
		x = new Produto();
		
		System.out.println("Digite o nome do produto:");
		x.name = sc.next();
		System.out.println("Digite o preço do produto");
		x.price = sc.nextDouble();
		System.out.println("Digite seu numero de estóque:");
		x.stock = sc.nextInt();
		
		System.out.println(x.ToString());
		
		System.out.println("Digite quantos produtos adicionar no estoque: ");
		int add = sc.nextInt();
		x.AdicionarProduto(add);
		System.out.println(x.ToString());
		
		System.out.println("Digite quantos produtos remover do estoque: ");
		int rmv = sc.nextInt();
		x.RemoverProduto(rmv);
		System.out.println(x.ToString());
		
		sc.close();
		
	}
}
