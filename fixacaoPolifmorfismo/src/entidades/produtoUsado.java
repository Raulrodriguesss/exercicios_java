package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class produtoUsado extends Produto{
	private Date manufacturedDate;
	
	 private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public produtoUsado(){
		
	}

	public produtoUsado(String nome, double preco, Date manufacturedDate) {
		super(nome, preco);
		this.manufacturedDate= manufacturedDate;
	}
	
	

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	@Override
	public String etiqueta() {
		
		return getNome()+" (USED) $ "+ getPreco()+" (manufactured date: "+sdf.format(getManufacturedDate())+")";
	}
	
}
