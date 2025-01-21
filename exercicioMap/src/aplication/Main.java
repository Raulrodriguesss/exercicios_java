package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votos = new LinkedHashMap<>();

		System.out.print(" insira o caminho completo do arquivo: ");
		String caminho = sc.next();
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String nome = fields[0];
				int count = Integer.parseInt(fields[1]);

				if (votos.containsKey(nome)) {
					int votosSoFar = votos.get(nome);
					votos.put(nome, votosSoFar + count);
				} else {

					votos.put(nome, count);
				}

				line = br.readLine();

			}

			for (String chave : votos.keySet()) {
				System.out.println(chave + ": " + votos.get(chave));
			}

		} catch (IOException e) {
			System.out.println(" erro: " + e.getMessage());
		}

		sc.close();
	}

}
