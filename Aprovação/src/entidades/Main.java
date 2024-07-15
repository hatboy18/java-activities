package entidades;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Alunos[] pessoas = new Alunos[n];
		
		for(int i = 0; i < pessoas.length; i++) {
			System.out.println("Digite o nome");
			String nome = sc.next();
			System.out.println("Digite a primeira nota");
			double nota1 = sc.nextDouble();
			System.out.println("Digite a segunda nota");
			double nota2 = sc.nextDouble();
			pessoas[i] = new Alunos(nome, nota1, nota2);
		}
		sc.close();
		
		System.out.println("Alunos Aprovados");
		for(int i = 0; i < pessoas.length; i++) {
			if((pessoas[i].getFirstNota() + pessoas[i].getSeccNota()) / 2 > 6.0) {
				System.out.println(pessoas[i].getName());
			}
		}
	}
} 