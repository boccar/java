package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Studant s1 = new Studant();
		
		System.out.println("Entre com o nome do aluno: ");
		s1.setAlunoNome(sc.next());
		

		System.out.println("Entre com a nota do primeiro trimestre: (Media 18, Maximo 30)");
		s1.setNota1(sc.nextDouble());
		
		System.out.println("Entre com a nota do segundo trimestre: (Media 21, Maximo 35)");
		s1.setNota2(sc.nextDouble());
		
		System.out.println("Entre com a nota do terceiro trimestre: (Media 21, Maximo 35)");
		s1.setNota3(sc.nextDouble());
		
		System.out.println("\nO aluno " + s1.getAlunoNome() + " obteve os seguintes resultados:");
		s1.calularFinal();
	
		sc.close();
	}

}
