package entities;

import java.util.Objects;

public class Cliente {
	
	private String name;
	private String acesso;

	public Cliente(String name,String acesso) {
		
		this.name = name;
		this.acesso = acesso;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	


	public String getAcesso() {
		return acesso;
	}


	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}


	@Override
	public String toString() {
		return "Cliente [name=" + name + ", acesso=" + acesso + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(name, other.name);
	}


	



	
	

}
