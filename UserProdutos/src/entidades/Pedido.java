package entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entidades_enum.StatusPedido;

public class Pedido {
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
    private LocalDateTime moment;
    private StatusPedido status;
    
    
    private User client;
    
    
	List<ProdutoPedido> produtos = new ArrayList<>();

    public LocalDateTime getMoment() {
        return moment;
    }

    public Pedido(LocalDateTime localDate, String status, User usuario) {
		this.moment = localDate;
		this.status = StatusPedido.valueOf(status);
		this.client = usuario;
	}

	public StatusPedido getStatus() {
        return status;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public void setAGUARDANDO_PAGAMENTO(StatusPedido status) {
        this.status = status;
    }
    
    public User getClient() {
		return client;
	}

	public void setClient(User client) {
		this.client = client;
	}
    
    public double TotalValor() {
    	double valorTot = 0;
    	for(ProdutoPedido i:produtos) {
    		valorTot += i.subTotal();
    		
    	}
    	return valorTot;
    }
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(fmt.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
    	for(ProdutoPedido i: produtos) {
    		sb.append(i + "\n");	
    		}
    	sb.append("Total price: $");
		sb.append(String.format("%.2f", TotalValor()));
		return sb.toString();
    		
    	
    }
    
    public void AddItem(ProdutoPedido product) {
        produtos.add(product);
    }
    public void RemoveItem(ProdutoPedido product){
        produtos.remove(product);
        
    }
    
    
}
