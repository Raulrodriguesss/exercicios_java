package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
	private int numContrato;
	private double valorTotal;
	private LocalDate data;
	private List<Parcela> parcelas= new ArrayList<>();
	
	public int getNumContrato() {
		return numContrato;
	}
	
	public void setNumContrato(int numContrato) {
		this.numContrato = numContrato;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public List<Parcela> getParcelas() {
		return parcelas;
	}
	
	
	public Contrato(int numContrato, double valorTotal, LocalDate data) {
		
		this.numContrato = numContrato;
		this.valorTotal = valorTotal;
		this.data = data;
		
	}
	
	
}
