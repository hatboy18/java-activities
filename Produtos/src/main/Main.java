package main;

import java.util.Scanner;

import product_info.Produto;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto:");
		String name = sc.next();
		System.out.println("Digite o preço do produto");
		double price = sc.nextDouble();
		System.out.println("Digite seu numero de estóque:");
		int stock = sc.nextInt();
		
		Produto product = new Produto(name, price, stock);
		
		System.out.println(product.ToString());
		
		System.out.println("Digite quantos produtos adicionar no estoque: ");
		int add = sc.nextInt();
		product.AdicionarProduto(add);
		System.out.println(product.ToString());
		
		System.out.println("Digite quantos produtos remover do estoque: ");
		int rmv = sc.nextInt();
		product.RemoverProduto(rmv);
		System.out.println(product.ToString());
		
		sc.close();
		
	}
}

