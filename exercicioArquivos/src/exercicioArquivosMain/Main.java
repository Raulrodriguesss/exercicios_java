package exercicioArquivosMain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Produto> produtos = new ArrayList<>();

		System.out.print(" insira o caminho do arquivo: ");
		String path = sc.nextLine();
		
		File file= new File(path);
		String caminhoPasta= file.getParent();
		
		boolean criacaoPasta= new File(caminhoPasta+"\\out").mkdir();
		
		String arquivoDestino= caminhoPasta+"\\out\\summary.csv";
		
		try(BufferedReader br=new BufferedReader(new FileReader(path))){
			
			String linha=br.readLine();
			while(linha!=null) {
				String[] items= linha.split(",");
				String nome=items[0];
				double preco=Double.parseDouble(items[1]);
				int quantidade= Integer.parseInt(items[2]);
				
				Produto produto= new Produto(nome,quantidade,preco);
				produtos.add(produto);
				
				linha=br.readLine();
			}
			try(BufferedWriter bw= new BufferedWriter(new FileWriter(arquivoDestino))){
				for(Produto produto: produtos) {
					bw.write(produto.getNome()+ ", "+ String.format("%.2f", produto.total()));
					bw.newLine();
				}
			}
			catch(IOException e){
				System.out.println(" erro na escrita do arquivo "+e.getMessage());
			}
		}
		
		catch(IOException e){
			System.out.println(" erro na leitura do arquivo "+e.getMessage());
		}
		sc.close();
	}

}
