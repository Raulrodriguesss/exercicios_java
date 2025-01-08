package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contrato;
import entidades.Parcela;
import servicos.payPalMetodoPagamento;
import servicos.servicoDeContrato;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		DateTimeFormatter fmt= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("insira os dados do contrato: ");
		System.out.print("numero do contrato: ");
		int numContrato= sc.nextInt();
		System.out.print("Data (dd/mm/aaaa): ");
		LocalDate dataContrato=LocalDate.parse(sc.next(),fmt);
		System.out.print("valor do contrato: ");
		double valorContrato=sc.nextDouble();
		
		Contrato contrato= new Contrato(numContrato,valorContrato,dataContrato);
		
		System.out.print("insira o numero de parcelas: ");
		int numParcelas=sc.nextInt();
		
		servicoDeContrato contratoDeServico = new servicoDeContrato(new payPalMetodoPagamento());
		
		contratoDeServico.processaContrato(contrato, numParcelas);
		
		System.out.println("parcelas: ");
		for(Parcela parcelas: contrato.getParcelas()) {
			System.out.println(parcelas);
		}

	}

}
