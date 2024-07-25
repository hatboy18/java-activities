package entidades;




public class ProdutoPedido {
    private Integer quantidade;
    private Double price;
    private Produto produto;
    
    public ProdutoPedido(int quantidade, double price, Produto product){
    	super();
        this.quantidade = quantidade;
        this.price = price;
        this.produto = product;
    
    }
    
    
    
    
    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPrice() {
        return price;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    
    
    public Double subTotal(){
    	return quantidade * price;
    	
    }


	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}




	@Override
	public String toString() {
		return " produto: " + produto.getName() + ", quantidade: " + quantidade + ", price: " + price + "SubTotal: " + subTotal();
	}
	
}
