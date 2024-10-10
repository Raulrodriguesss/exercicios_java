package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		List<Pessoa> pessoas= new ArrayList<>();
		
		System.out.println(" insira o número de pagadores: ");
			int numPagadores= sc.nextInt();
			for(int i=0;i<numPagadores;i++) {
				System.out.println(" insira os dados da pessoa n"+(i+1));
				System.out.print(" pessoa fisica ou juridica? (f/j) ");
				char tipoPessoa=sc.next().charAt(0);
				
				System.out.print(" insira o nome: ");
				sc.nextLine();
				String nome=sc.nextLine();	
				System.out.print(" insira a renda anual ");
				double rendaAnual=sc.nextDouble();
				if(tipoPessoa=='f') {
					System.out.print(" houveram gastos com saúde? se não digite 0: ");
					double gastosSaude=sc.nextDouble();
					pessoas.add(new PessoaFisica(nome,rendaAnual,gastosSaude));
				}
				else if(tipoPessoa=='j') {
					System.out.print(" informe o numero de funcionários ");
					int numFunc =sc.nextInt();
					pessoas.add(new PessoaJuridica(nome,rendaAnual,numFunc));
				}
				else {System.out.print("você não digitou uma opção válida! ");
				}
			}
				double soma=0;
				System.out.println("taxas pagas: ");
				for(Pessoa pessoa: pessoas) {
					double imposto=pessoa.calculaImposto();
					System.out.println(pessoa.getNome()+ ": $ "+  String.format("%.2f", imposto));
					soma+=imposto;
				}
				
				System.out.println("total de taxas: "+String.format("%.2f", soma));
			
		
		
		sc.close();
	}

}
