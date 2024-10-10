package MAIN;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import classesEnum.senioridade;
import entidades.contratoDeHoras;
import entidades.departamento;
import entidades.funcionario;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("insira o nome do departamento: ");
		String nomeDepart = sc.nextLine();
		departamento departament = new departamento(nomeDepart);
		System.out.println(" insira os dados do funcionário: ");
		System.out.print(" insira o nome do funcionário: ");
		String nome = sc.nextLine();
		System.out.print(" insira o nivel do funcionário: ");
		String nivel = sc.next();
		senioridade nivelFunc = senioridade.valueOf(nivel);
		System.out.print("insira o salario base: ");
		double salariobase = sc.nextDouble();
		funcionario funcionario = new funcionario(nome, salariobase, nivelFunc, departament);
		System.out.print("quantos contratos serão gerados para esse funcionário? ");
		int numContratos = sc.nextInt();

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date dataf = null;
		for (int i = 0; i < numContratos; i++) {

			System.out.println("insira os dados do contrato numero: " + (i + 1));
			System.out.print("data de inicio do contrato no formato DD/MM/YYYY: ");
			sc.nextLine();
			String datanf = sc.nextLine();

			try {
				dataf = formatter.parse(datanf);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("insira o valor da hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("insira o numero de horas:");
			int numHoras = sc.nextInt();
			contratoDeHoras contrato = new contratoDeHoras(dataf, valorHora, numHoras);
			funcionario.adicionarContrato(contrato);
		}
		System.out.print("insira um mes/ano para verificar o extrato: ");
		sc.nextLine();
		String data = sc.nextLine();
		String[] dataSeparada = data.split("/");
		int mes = Integer.parseInt(dataSeparada[0]);
		int ano = Integer.parseInt(dataSeparada[1]);
		double extratof = funcionario.gerarExtrato(ano, mes);

		System.out.println("informações:");
		System.out.println("nome: " + funcionario.getNome());
		System.out.println("departamento: " + funcionario.getDepart().getNomeDepartamento());
		System.out.printf("extrato para o periodo: %d/%d: %.2f", mes, ano, extratof);

		sc.close();
	}

}
