package entidades;

import java.util.Date;

public class contratoDeHoras {

	private Date data;
	private double valordaHora;
	private int horas;

	public contratoDeHoras(Date data, double valordaHora, int horas) {

		this.data = data;
		this.valordaHora = valordaHora;
		this.horas = horas;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValordaHora() {
		return valordaHora;
	}

	public void setValordaHora(double valordaHora) {
		this.valordaHora = valordaHora;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double valortotal() {

		return valordaHora * horas;
	}
}
