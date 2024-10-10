package entidades;

public class itemPedido {
	private int quantidade;
	private double preco;
	private Produto produto;
	
	
	public itemPedido() {
		
	}
	public itemPedido(int quantidade, double preco,Produto produto) {
		this.produto= produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		
		return preco*quantidade;
	}
	@Override
	public String toString() {
		return produto.getNome() 
				+ ", $" 
				+ String.format("%.2f", preco) 
				+ ", Quantity: " 
				+ quantidade + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
}
