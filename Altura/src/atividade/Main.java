package atividade;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pessoas[] vect = new Pessoas[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Digite nome: ");
			String nome = sc.next();
			System.out.println("Digite idade: ");
			int idade = sc.nextInt();
			System.out.println("Digite altura: ");
			double altura = sc.nextDouble();
			
			vect[i] = new Pessoas(nome, idade, altura);
		}
		
		double sum = 0;
		int menor = 0;
		for(int i = 0; i<vect.length; i++) {
			sum += vect[i].getHeight();
			if(vect[i].getAge() <= 16) {
				menor++;
			}
		}
		
		double percent = menor * 100 / n;
		double media = sum / n;
		
		System.out.printf("%.1f porcento das pessoas são menores de 16 %n", percent);
		System.out.printf("A altura média dessas pessoas é: %.2f%n", media);
		
		sc.close();
		
	}

}
