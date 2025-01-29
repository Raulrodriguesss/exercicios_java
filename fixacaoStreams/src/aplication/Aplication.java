package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("insira o caminho do arquivo: ");
		String caminho=sc.next();
		
		try(BufferedReader br= new BufferedReader(new FileReader(caminho))){
			
			List<Product> list = new ArrayList<>();
			
			String line= br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line=br.readLine();
			}
			
			double media = list.stream()
					.map(p -> p.getPrice())
					.reduce(0.0,(x,y)-> x+y)/list.size();
			
			System.out.println("preço médio: " + String.format("%.2f",media));
			
			Comparator<String> comp= (s1,s2)->s1.compareToIgnoreCase(s2); 
			
			List<String> names= list.stream()
					.filter(p -> p.getPrice()< media)
					.map(p-> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
			names.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println("erro na execução do prgrama ");
			e.printStackTrace();
		} 
		
		sc.close();

	}

}
