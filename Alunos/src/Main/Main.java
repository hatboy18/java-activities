package Main;

import java.util.Scanner;

import student.Aluno;
/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema.*/

public class Main {
	
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		Aluno fulano = new Aluno();
		
		System.out.println("Nome: ");
		fulano.name = sc.nextLine();
		
		System.out.println("nota 1° SEMESTRE (MAX : 30,00): ");
		fulano.firstSemester = sc.nextDouble();
		System.out.println("nota 2° SEMESTRE (MAX : 35,00): ");
		fulano.seccSemester = sc.nextDouble();
		System.out.println("nota 3° SEMESTRE (MAX : 35,00): ");
		fulano.thirdSemester = sc.nextDouble();
		
		if (fulano.firstSemester > 30.00 || fulano.seccSemester > 35.00 || fulano.seccSemester > 35.00) {
			System.out.println("Alguma Nota foi digitada acima do máximo..... Reiniciando");
		}else {
			if (fulano.Grade() < 60.0) {
				System.out.println("REPROVOU");
				System.out.printf("Faltou %.2f Pontos%n", fulano.Situation());
				}
				else {
				System.out.println("PASS");
				}
			
		}		
		sc.close();
	}
}
