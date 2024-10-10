package entidades;

public class Conta {
	private int id;
	private int contID;
	private double saldo;
	private String nomeUsuario;
	
	public int getId() {
		return id;
	}
	
	public Conta(double saldo, String nomeUsuario) {
		contID++;
		this.id = contID;
		this.saldo = saldo;
		this.nomeUsuario = nomeUsuario;
		
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public void fazDeposito(double valorDeposito){
		saldo+= valorDeposito;
	}	

	public void fazSaque(double valorSaque) {
		saldo-= valorSaque+5.0;
	}

}
