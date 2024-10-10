package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.statusPedido;

public class Pedido {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Cliente cliente;
	private Date dataPedido;
	
	private statusPedido status;
	private List<itemPedido> itensPedido= new ArrayList<>();
	
	public Pedido() {
		
	}
	
	public Pedido(Cliente cliente, Date dataPedido, statusPedido status) {
		
		this.cliente = cliente;
		this.dataPedido = dataPedido;
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public statusPedido getStatus() {
		return status;
	}

	public void setStatus(statusPedido status) {
		this.status = status;
	}

	public List<itemPedido> getItensPedido() {
		return itensPedido;
	}

	public void addItem(itemPedido pedido) {
		itensPedido.add(pedido);
	}
	public void removeItem(itemPedido pedido) {
		itensPedido.remove(pedido);
	}
	public double total() {
		double soma=0;
		for(itemPedido itens: itensPedido) {
			soma+= itens.subTotal();
		}
		return soma;
	}
	 
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(dataPedido) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order items:\n");
		for (itemPedido item : itensPedido) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
