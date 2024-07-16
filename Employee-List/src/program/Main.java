package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Employee;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 
		List<Employee> funcionario = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			System.out.println("Empregado #" + (i+1));
			System.out.println("Digite o ID:");
			int id = sc.nextInt();
			while(JaTemId(funcionario, id)) {
				System.out.println("Já está em uso tente novamente: ");
				id = sc.nextInt();
			}
			System.out.println("Digite o Nome:");
			String nome = sc.next();
			System.out.println("Digite o Salário:");
			Double salario = sc.nextDouble();
			Employee empregado = new Employee(id, nome, salario);
			funcionario.add(empregado);
		}
		
		System.out.println("Digite o id do funcionário que irá receber aumento:");

		int id = sc.nextInt();
		Employee resultado = funcionario.stream().filter(x -> x.getId() == id).findAny().orElse(null);
		
		if(resultado != null) {
			System.out.println("Digite o Aumento a ser dado:");
			int aumento = sc.nextInt();
			resultado.Aumentar(aumento);
			
			for(Employee i : funcionario) {
				System.out.println(i.toString());
			}
			
		}else {
			System.out.println("Funcionário Inválido.");
		}
		
		
		
		sc.close();
	}	
	public static boolean JaTemId(List<Employee> funcionario,  int id) {
		Employee empregado = funcionario.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return empregado != null;
	}
	
}
