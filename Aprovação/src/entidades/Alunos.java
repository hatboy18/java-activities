package entidades;

public class Alunos {
	private String name;
	private double firstNota;
	private double seccNota;
	
	public Alunos(String name, double firstNota, double seccNota) {
		super();
		this.name = name;
		this.firstNota = firstNota;
		this.seccNota = seccNota;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFirstNota() {
		return firstNota;
	}
	public void setFirstNota(double firstNota) {
		this.firstNota = firstNota;
	}
	public double getSeccNota() {
		return seccNota;
	}
	public void setSeccNota(double seccNota) {
		this.seccNota = seccNota;
	}
	
	
}
