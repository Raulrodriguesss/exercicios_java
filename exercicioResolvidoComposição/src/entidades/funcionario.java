package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import classesEnum.senioridade;

public class funcionario {

	private String nome;
	private double salarioBase;
	private senioridade nivelFuncionario;

	private departamento depart;
	private List<contratoDeHoras> contratos = new ArrayList<>();

	public funcionario(String nome, double salarioBase, senioridade nivel, departamento depart) {

		this.nome = nome;
		this.salarioBase = salarioBase;
		this.nivelFuncionario = nivel;
		this.depart = depart;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public senioridade getNivelFuncionario() {
		return nivelFuncionario;
	}

	public void setNivelFuncionario(senioridade nivelFuncionario) {
		this.nivelFuncionario = nivelFuncionario;
	}

	public List<contratoDeHoras> getContratos() {
		return contratos;
	}

	public departamento getDepart() {
		return depart;
	}

	public void setDepart(departamento depart) {
		this.depart = depart;
	}

	public void adicionarContrato(contratoDeHoras contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(contratoDeHoras contrato) {
		contratos.remove(contrato);
	}

	public double gerarExtrato(int ano, int mes) {
		double somatorio = salarioBase;
		Calendar calendario = Calendar.getInstance();
		for (contratoDeHoras contract : contratos) {
			calendario.setTime(contract.getData());
			int anoDoContrato = calendario.get(Calendar.YEAR);
			int mesDoContrato = 1 + calendario.get(Calendar.MONTH);
			if (mesDoContrato == mes && anoDoContrato == ano) {
				somatorio += contract.valortotal();
			}
		}
		return somatorio;
	}

}
