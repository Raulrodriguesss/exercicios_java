package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Empregado;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" insira o caminho do arquivo: ");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader( new FileReader(path))){
			
			List <Empregado> emps = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				emps.add(new Empregado(fields[0],fields[1],Double.parseDouble(fields[2])));
				
				line= br.readLine();
			}
			
			System.out.println(" insira o valor de salário: ");
			double salary = sc.nextDouble();
			
			List<String> emails = emps.stream()
					.filter(p -> p.getSalario()> salary)
					.map(p-> p.getEmail())
					.sorted()
					.collect(Collectors.toList());
			emails.forEach(System.out:: println);
			
			double soma = emps.stream()
					.filter(p ->p.getNome().toUpperCase().charAt(0)== 'M')
					.map(p-> p.getSalario())
					.reduce(0.0,(x,y)-> x+y);
			System.out.print(" a soma do salário dos funcionários que começam com M é: "+ soma);
			
		}catch(IOException e) {
			e.getMessage();
		}
		
		sc.close();

	}

}
