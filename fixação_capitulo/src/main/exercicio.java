package main;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Funcionario;

public class exercicio {

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("bem vindo ao banco finanFeliz ");
		System.out.println("vamos criar uma nova conta! ");
		System.out.print("insira o nome do proprietário da conta: ");
		String nomeUsuario= sc.nextLine();
		double saldoIni=0;
		Conta conta = new Conta(saldoIni,nomeUsuario);
		System.out.print("deseja informar um saldo inicial para a conta? digite s para sim e n para não: ");
		String resposta = sc.nextLine();
		if (resposta.equalsIgnoreCase("s")){
			
			System.out.print(" informe o valor inicial do saldo: ");
			saldoIni =sc.nextDouble();
			 conta.fazDeposito(saldoIni);
			 
		}
		System.out.println("informações da conta: ");
		System.out.println("nome do proprietário: "+ conta.getNomeUsuario());
		System.out.println("numero da conta: "+ conta.getId());
		System.out.println("saldo da conta: "+ conta.getSaldo());
		System.out.println("informe o valor para depósito: ");
		double valorDeposit = sc.nextDouble();
		conta.fazDeposito(valorDeposit);
		System.out.println("saldo após deposito: "+ conta.getSaldo());
		System.out.println("informe o valor para saque: ");
		double valorSaque = sc.nextDouble();
		conta.fazSaque(valorSaque);
		System.out.println("saldo após deposito: "+ conta.getSaldo());*/
		
		
		/*
		System.out.println("quantos números você vai digitar?");
		int quantNumeros = sc.nextInt();
		int numeros[] = new int[quantNumeros];
		for( int i=0;i<numeros.length;i++) {
			System.out.print("digite um número: ");
			numeros[i]= sc.nextInt();
			
		}
		System.out.print("os números negativos são: ");
		for(int i=0; i<numeros.length;i++) {
			if(numeros[i]<0) {
				System.out.println(numeros[i]);
			}
		}
		*/
		
		/*System.out.print("quantas pessoas serão descritas: ");
		 int quantPessoas= sc.nextInt();
		 pessoa[] pessoah= new pessoa[quantPessoas];
		 for(int i=0; i <pessoah.length; i++) {
			 System.out.println("informe o nome dessa pessoa: ");
			 sc.nextLine();
			 String nome= sc.nextLine();
			 System.out.print("informe a idade dessa pessoa: ");
			int idade = sc.nextInt();
			 System.out.print("informe a altura dessa pessoa: ");
			 float altura =sc.nextFloat();
			 pessoah[i]= new pessoa(nome,idade,altura);
			 
		 }
		 float soma=0;
		 int menores16=0;
		 for(int i=0; i <pessoah.length; i++) {
			 
			 
			 soma+= pessoah[i].getAltura();
			 if(pessoah[i].getIdade()<16) {
				 menores16++;
			 }
		 }
		 float mediaAltura= soma/pessoah.length;
		 int qntMenores= (menores16*100)/pessoah.length ;
		 for(int i=0; i <pessoah.length; i++) {
			 if(pessoah[i].getIdade()<16) {
				 System.out.println(pessoah[i].getNome());
			 }
		 }
	
		 System.out.println("altura média: "+mediaAltura);
		 System.out.println("porcentagem de menores de 16 anos: "+qntMenores+"%");
		 */
		
		/*int[] quartos = new int[10];
		System.out.print("quantos quartos serão alugados? ");
		int qntQuartos =sc.nextInt();
		int[] quartoSelecionado = new int[qntQuartos];
		String[] nomeOcupante =new String[qntQuartos];
		String[] emailOcupante =new String[qntQuartos];
		
		
		for(int i=0; i<qntQuartos;i++) {
			System.out.print(" insira as informações do quarto: "+i+1+"/n");
			System.out.print("nome do ocupante: ");
			nomeOcupante[i]= sc.nextLine();
			
			System.out.print("e-mail do ocupante: ");
			emailOcupante[i]= sc.nextLine();
			sc.nextLine();
			System.out.print("e-mail do ocupante: ");
			int numQuarto =sc.nextInt();
			if(quartos[i]==numQuarto) {}
			*/
			
		/*System.out.println("quantos funcionários serão cadastrados? ");
		 int qntFunc =sc.nextInt();
		 ArrayList<Integer> listanum = new ArrayList<>();

		 for(int i=0; i< qntFunc; i++) {
			 
			 System.out.println("cadastrando funcionário numero "+i);
			 System.out.print("insira o nome do funcionário ");
			 String nome= sc.nextLine();
			 sc.nextLine();
			 System.out.print("insira o ID do funcionário ");
			 int id= sc.nextInt();
			 
				 if(listanum.contains(id)) {
					 System.out.println("id já foi inserido, tentei novamente ");
					 break;
				 }
			 listanum.add(id);
				 System.out.print("insira o salario do funcionário ");
			 float salario= sc.nextFloat();
			 Funcionario funcionario = new Funcionario(nome,id,salario);
			 
			 System.out.println("INSIRA A id DO FUNCIONARIO: ");
			 
				 System.out.println("INSIRA A PORCENTAGEM DE AUMENTO DO SALARIO:");
				 float porcentagem =sc.nextFloat();
				 funcionario.calculaSalario(porcentagem);
				 
		 } */
		int senha=0;
		while (senha !=2002) {
			System.out.println("senha invalida! ");
			senha=sc.nextInt();
			
			
		}
		System.out.println("senha aceita! ");
		sc.close();
		}
		
		
	}

