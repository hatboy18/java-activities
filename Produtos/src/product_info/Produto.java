package product_info;

public class Produto {
	public String name;
	public double price;
	public int stock;
	
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
		return "\nNome: " + name + "\n Preço: " + price + "\n Unidades: " + stock + "\n Valor Total: R$" + ValorTotalEstoq(); 
	}
}
