package entidades;

import java.util.Scanner;
public class Hotel {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Pessoas[] rapaziada = new Pessoas[10];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Rent " + (i+1) + "#");
			System.out.println("Digite o Nome");
			String nome = sc.next();
			System.out.println("Digite o Email");
			String email = sc.next();
			System.out.println("Digite o número do quarto");
			int quarto = sc.nextInt();
			
			rapaziada[quarto] = new Pessoas(nome, email);
		}
		
		for(int i = 0; i < rapaziada.length; i++) {
			if(rapaziada[i] != null) {
				System.out.println(i + ": " + rapaziada[i].getName() + ", " + rapaziada[i].getEmail());
				
			}
		}
		sc.close();
	}

}
