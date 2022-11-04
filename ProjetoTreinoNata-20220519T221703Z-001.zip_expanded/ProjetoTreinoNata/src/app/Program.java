package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Treino t1 = new Treino ();
		
		System.out.println("Informe o nome do atleta: ");
		t1.setNome(sc.next());
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe a marca " + i + ": ");
			t1.armazenarMarca(i, sc.nextDouble());
		}
		System.out.println(t1);
		double media = t1.calcularMediaDeMarcass();
		double maior= t1.obterMaiorMarca();
		double menor = t1.obterMenorMarca();
		
		System.out.println("Media de marcas: " + media);
		System.out.println("Maior marca: " + maior);
		System.out.println("Menor marca: " + menor);
	}

}
