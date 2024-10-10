	package aplicacao;
	
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;
	import java.util.Scanner;
	
	import entidades.Produto;
	import entidades.produtoImportado;
	import entidades.produtoUsado;
	
	public class Main {
	
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
			List<Produto> produtos= new ArrayList<>();
			
			System.out.print(" insira o número de produtos: ");
			int qntProdutos=sc.nextInt();
			for(int i=0;i<qntProdutos;i++) {
				
			System.out.printf("insira as informações do produto %d%n",i+1);
			System.out.print(" é um produto comum, importado ou usado?(c/i/u): ");
			sc.nextLine();
			String tipoProduto =String.valueOf( sc.nextLine().charAt(0));
			
			String nomeProduto;
	        double preco;
	        Produto produto = null;
			
			switch(tipoProduto) {
			
			case "c": 
				System.out.print("insira o nome do produto: ");
				nomeProduto=sc.nextLine();
				System.out.print("insira o preço: ");
				preco=sc.nextDouble();
				produto= new Produto(nomeProduto,preco);
				produtos.add(produto);
				break;
			
			case "i":
				System.out.print("insira o nome do produto: ");
				 nomeProduto=sc.nextLine();
				System.out.println("insira o preço: ");
				 preco=sc.nextDouble();
				System.out.print("insira o customsFee do produto: ");
				double customsFee =sc.nextDouble();
				produto= new produtoImportado(nomeProduto,preco,customsFee);
				produtos.add(produto);
				break;
				
			case "u":
				System.out.print("insira o nome do produto: ");
				 nomeProduto=sc.nextLine();
				System.out.println("insira o preço: ");
				 preco=sc.nextDouble();
				System.out.print("insira data de manufatura do produto(dd/MM/aaaa): ");
				sc.nextLine();
				String dataNformatada= sc.nextLine();
				Date dataManufatura=null;
				try {
					dataManufatura= sdf.parse(dataNformatada);
				}catch (ParseException e) {
		            System.out.println("Formato de data inválido.");
		        }
				produto= new produtoUsado(nomeProduto,preco,dataManufatura);
				produtos.add(produto);
				break;
				
			}
			
		}
			System.out.println("etiquetas dos produtos: ");
			for(Produto produto :produtos) {
				System.out.println(produto.etiqueta());
			}
			sc.close();
	  }
	}
