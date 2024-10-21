package Main;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import excecao.excecaoRegraDeNegocio;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println(" Cadastro de nova conta ");
		System.out.print(" insira o nome do proprietário da conta: ");
		sc.nextLine();
		String nome=sc.nextLine();
		System.out.print(" insira um número para representar a conta: ");
		int numConta=sc.nextInt();
		System.out.print(" insira o saldo inicial da conta em questão: ");
		double saldo=sc.nextDouble();
		System.out.print(" defina um limite de saque para essa conta: ");
		double limite=sc.nextDouble();
		
		Conta conta= new Conta(numConta,nome,saldo,limite);
		
		System.out.print(" insira o valor que deseja sacar: ");
		Double valorSaque=sc.nextDouble();
		
		try {
			conta.saque(valorSaque);
			System.out.print(" o seu novo saldo é :"+ conta.getSaldo());
		}
		catch(excecaoRegraDeNegocio e){
			System.out.print(e.getMessage());
		}
		
		
		
		
		
		sc.close();

	}

}
