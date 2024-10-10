package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Pedido;
import entidades.Produto;
import entidades.itemPedido;
import enums.statusPedido;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("insira os dados do cliente: ");
		System.out.print("nome: ");
		String nome= sc.nextLine();
		System.out.print("email: ");
		String email= sc.next();
		System.out.print("data de nascimento: ");
		Date dataNasc= sdf.parse(sc.next());		
		Cliente cliente= new Cliente(nome,email,dataNasc);
		
		
		
		System.out.println("insira os dados do pedido: ");
		System.out.print("status do pedido: ");
		statusPedido status= statusPedido.valueOf(sc.next());
		
		Pedido pedido= new Pedido(cliente,new Date(),status);
		
		System.out.print("Quantos itens para esse pedido? ");
		int numItens= sc.nextInt();
		for(int i=0;i<numItens;i++){
			System.out.println("insira os dados do item "+(i+1));
			System.out.print("nome do produto: ");
			String nomeProd=sc.next();
			System.out.print("preço do produto: ");
			double preco= sc.nextDouble();
			
			Produto produto= new Produto(nomeProd,preco);
		
			
			System.out.print("quantidade: ");
			int quantidade= sc.nextInt();
			
			itemPedido itemPed= new itemPedido(quantidade,preco,produto);
			pedido.addItem(itemPed);
		}
			System.out.println(pedido);
			
				
		
		sc.close();
	}

}
