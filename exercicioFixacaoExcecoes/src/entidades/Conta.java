package entidades;

import excecao.excecaoRegraDeNegocio;

public class Conta {
	private int numConta;
	private String NomeProprietario;
	private double saldo;
	private double limiteDeSaque;
	
	
	
	public Conta(int numConta, String nomeProprietario, double saldo, double limiteDeSaque) {
		
		this.numConta = numConta;
		NomeProprietario = nomeProprietario;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getNomeProprietario() {
		return NomeProprietario;
	}
	public void setNomeProprietario(String nomeProprietario) {
		NomeProprietario = nomeProprietario;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimiteDeSaque() {
		return limiteDeSaque;
	}
	public void setLimiteDeSaque(double limiteDeSaque) {
		this.limiteDeSaque = limiteDeSaque;
	}
	
	public void deposito(double valor) {
		saldo+=valor;
	}
	
	public void saque(double valor) {
		validarSaque(valor);
		saldo-=valor;
	}
	public void validarSaque(double valor) {
		if(valor>getLimiteDeSaque()) {
			throw new excecaoRegraDeNegocio(" O valor solicitado é maior que o limite de saldo disponível ");
		}
		if(valor>getSaldo()) {
			throw new excecaoRegraDeNegocio(" O valor solicitado é maior que o saldo disponóvel ");
		}
	}
}
