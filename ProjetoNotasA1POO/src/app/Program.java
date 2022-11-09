package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Studant s1 = new Studant();
		notas n1 = new notas();

		System.out.println("Entre com o nome do aluno: ");
		s1.setAlunoNome(sc.next());

		System.out.println("Qual é a média?");
		n1.setMedia(sc.nextDouble());

		System.out.println("Entre com a nota do primeiro trimestre: (Media " + n1.getMedia() + ", Maximo 100)");
		n1.setNota1(sc.nextDouble());

		System.out.println("Entre com a nota do segundo trimestre: (Media " + n1.getMedia() + ", Maximo 100)");
		n1.setNota2(sc.nextDouble());

		System.out.println("Entre com a nota do terceiro trimestre: (Media " + n1.getMedia() + ", Maximo 100)");
		n1.setNota3(sc.nextDouble());

		System.out.println("\nO aluno " + s1.getAlunoNome() + " obteve os seguintes resultados:");
		n1.calularFinal();

		sc.close();
	}

}
