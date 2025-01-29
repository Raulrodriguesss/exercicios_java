package entities;

public class Empregado {
	private String nome;
	private double salario;
	private String email;
	public Empregado(String nome, String email, double salario) {
		
		this.nome = nome;
		this.salario = salario;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", salario=" + String.format("%.2f",salario) + ", email=" + email + "]";
	}
	
	
	
}
