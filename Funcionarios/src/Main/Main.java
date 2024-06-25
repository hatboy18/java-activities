package Main;

import java.util.Scanner;

import funcionario.Employee;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Employee mano = new Employee();
		
		System.out.println("Nome: ");
		mano.name = sc.nextLine();
		System.out.println("Salário Bruto: ");
		mano.salarioBruto = sc.nextDouble();
		System.out.println("Contas: ");
		mano.taxes = sc.nextDouble();
		
		
		System.out.println(mano.ToString());
	
		System.out.println("Porcentagem de aumento: ");
		double aumento = sc.nextDouble();
		mano.Aumento(aumento);
		
		
		sc.close();
		
		System.out.println(mano.ToString());
		
	}
}
