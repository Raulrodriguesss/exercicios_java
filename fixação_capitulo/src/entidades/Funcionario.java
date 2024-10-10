package entidades;

public class Funcionario {

	private int ID;
	private String nome;
	private float salario;
	public Funcionario(String nome, int ID, float altura) {
		
		this.ID = ID;
		this.nome = nome;
		this.salario = altura;
	}
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getNome() {
		return nome;
	}
	public void setIdade(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	
	public float calculaSalario(float porcentagem)
	{
		 salario += (salario*porcentagem)/100;
		 return salario;
	}	
}
