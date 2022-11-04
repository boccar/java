package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		do {
			System.out.println("Informe um n�mero positivo: ");
			numero = sc.nextInt();
			if(numero<0) {
				System.out.println("Amigo, digite apenas n�meros positivos.");
			}
		}while(numero<0);
	
		//Numero n1 = new Numero(numero);
		
		int escolha;
		
		do {
			System.out.println("*************** Menu *****************");
			System.out.println("1 - Visualizar o n�mero digitado");
			System.out.println("2 - Alterar n�mero");
			System.out.println("3 - Visualizar Fatorial do n�mero");
			System.out.println("4 - Visualizar Somatorio do n�mero");
			System.out.println("5 - Visualizar quantidade de multiplos do numero");
			System.out.println("6 - Ver se o n�emro � primo");
			System.out.println("0 - Sair");
			System.out.println("->");
			
			escolha = sc.nextInt();
			
			switch(escolha) {
			
			}
		}while(escolha!=0);
		
		sc.close();
	}
	
	
}