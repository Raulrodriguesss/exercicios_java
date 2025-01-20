package aplication;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		HashSet<Integer> AlunosCursoA= new HashSet<>();
		HashSet<Integer> AlunosCursoB= new HashSet<>();
		HashSet<Integer> AlunosCursoC= new HashSet<>();
		HashSet<Integer> AlunosAlex= new HashSet<>();
		
		System.out.print(" quantos estudantes para o curso A? ");
		int numAlunosA= sc.nextInt();
		
		System.out.print(" insira o numero dos alunos do curso: ");
		for(int i=0;i<numAlunosA;i++) {
			
			AlunosCursoA.add(sc.nextInt());
		}
		
		System.out.print(" quantos estudantes para o curso B? ");
		int numAlunosB= sc.nextInt();
		
		System.out.print(" insira o numero dos alunos do curso: ");
		for(int i=0;i<numAlunosB;i++) {
			
			AlunosCursoB.add(sc.nextInt());
		}
		
		System.out.print(" quantos estudantes para o curso C? ");
		int numAlunosC= sc.nextInt();
		
		System.out.print(" insira o numero dos alunos do curso: ");
		for(int i=0;i<numAlunosC;i++) {
			
			AlunosCursoC.add(sc.nextInt());
		}
		
		System.out.println(AlunosCursoA);
		System.out.println(AlunosCursoB);
		System.out.println(AlunosCursoC);
		
		AlunosAlex.addAll(AlunosCursoA);
		AlunosAlex.addAll(AlunosCursoB);
		AlunosAlex.addAll(AlunosCursoC);
		
		System.out.println("TOTAL DE ESTUDANTES: "+ AlunosAlex.size());
		
		sc.close();

	}

}
