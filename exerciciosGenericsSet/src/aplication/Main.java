package aplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Cliente;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" Insira o caminho completo do arquivo: ");
		String path = sc.next();
		sc.nextLine();
		
		File file= new File(path);
		Set<Cliente> list= new HashSet<>();
		
		try(BufferedReader br= new BufferedReader(new FileReader(file))){
			
			
			
			String line= br.readLine();
			while(line!= null) {
				String[] fields = line.split(" ");
				String name=fields[0];
				String acesso = fields[1];
				list.add(new Cliente(name,acesso));
				
				 line= br.readLine(); 
			}
			
			
		}catch(IOException e ) {
			System.out.println("erro na leitura do arquivo!"+ e.getMessage());
		}
		
		System.out.println("total de usuários: "+list.size());
		sc.close();
	}

}
