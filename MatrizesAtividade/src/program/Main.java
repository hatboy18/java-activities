package program;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite linha:");
		int linhas = sc.nextInt();
		System.out.println("Digite coluna:");
		int colunas = sc.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite qual número deseja procurar: ");
		int onde = sc.nextInt();
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				if(matriz[i][j] == onde) {
					System.out.println("Posição: " + i + ", " + j);
					if(j > 0 ) {
						
						System.out.println("Esquerda: " + matriz[i][j-1]);
						
					}
					if(j < matriz[i].length-1) {
						
						System.out.println("Direita: " + matriz[i][j+1]);
						
					}
					if(i > 0) {
						
						System.out.println("Cima: " + matriz[i-1][j]);
						
					}
					if(i < matriz.length-1) {
						
						System.out.println("Baixo: " + matriz[i+1][j]);
					}
					
					
				}
			}
		}
		for(int[]n:matriz) {
			for(int i: n) {
				System.out.print(i);
			}
			System.out.println();
		}
		sc.close();
	}
	

}
