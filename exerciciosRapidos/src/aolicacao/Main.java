package aolicacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		File file= new File("C:\\Users\\raulr\\OneDrive\\Documentos\\atv_lab.txt");
		Scanner sc= null;
		try {
			sc= new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		finally {
			if(sc !=null) {
				sc.close();
			}
		}
	}

}
