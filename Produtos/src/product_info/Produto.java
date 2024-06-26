package product_info;

public class Produto {
	private String name;
	private double price;
	private int stock;
	
	public Produto(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getStock() {
		return stock;
	}
	
	public double ValorTotalEstoq() {
		return price * stock;
	}
	public void AdicionarProduto(int stock) {
		this.stock += stock;
		
	}
	public void RemoverProduto(int stock) {
		this.stock -= stock;
	}
	public String ToString() {
		return "\nNome: " + name + "\n Preço: " + price + "\n Unidades: " + stock + "\n Valor Total: " + ValorTotalEstoq(); 
	}
}
