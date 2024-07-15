package numeros;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nums = sc.nextInt();
		
		int[] inteiros = new int[nums];
		
		for(int i = 0; i < inteiros.length; i++) {
			System.out.println("Digite um numero");
			inteiros[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Numeros Negativos");
		for(int i = 0; i < inteiros.length; i++) {
			if(inteiros[i] < 0) {
				System.out.println(inteiros[i]);
			}
		}
	}
}
