package ret;

public class Retangulo {

	public double width;
	public double height;
	
	public double area() {
		double area = width * height;
		return area;
	}
	
	public double perimetro() {
		double metro = 2 * (height + width);
		return metro;
		
	}
	public double diagonal() {
		double diagono = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return diagono;
	}
	
}
