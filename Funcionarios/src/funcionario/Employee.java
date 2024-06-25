package funcionario;

public class Employee {
	public String name;
	public double salarioBruto;
	public double taxes;
	
	public double Salarioliquido() {
		double salary = salarioBruto - taxes;
		return salary;
	}
	public double Aumento(double percent) {
		percent = (percent / 100) + 1;
		salarioBruto = salarioBruto * percent;
		return salarioBruto;
	}
	public String ToString() {
		return name + ", " + "R$" + String.format("%.2f", Salarioliquido());
	}
}
