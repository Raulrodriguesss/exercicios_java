package entidades;

public class produtoImportado extends Produto{
	private double customsFee;
	
	public produtoImportado(){
		
	}

	public produtoImportado(String nome, double preco, double customsFee) {
		super(nome, preco);
		this.customsFee= customsFee;
	}
	
	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}

	public double precoTotal() {
		return getPreco()+getCustomsFee();
	}
	
	@Override
	public String etiqueta(){
		return getNome()+ " $ "+precoTotal()+ "(CustomsFee: "+getCustomsFee()+" )";
	}
	

}
