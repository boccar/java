package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;

		do {
			System.out.println("Informe um número positivo: ");
			numero = sc.nextInt();
			if (numero < 0) {
				System.out.println("Amigo, digite apenas números positivos.");
			}
		} while (numero < 0);

		Numero n1 = new Numero(numero);

		int escolha;

		do {
			System.out.println("*************** Menu *****************");
			System.out.println("1 - Visualizar o número digitado");
			System.out.println("2 - Alterar número");
			System.out.println("3 - Visualizar Fatorial do número");
			System.out.println("4 - Visualizar Somatorio do número");
			System.out.println("5 - Visualizar quantidade de multiplos do numero");
			System.out.println("6 - Ver se o núemro é primo");
			System.out.println("0 - Sair");
			System.out.println("->");

			escolha = sc.nextInt();

			switch (escolha) {

			case 1:
				System.out.println("Número digitado " + n1.getValor());
				break;
			case 2:
				int novoNumero;
				do {
					System.out.println("Informe o novo número: ");
					novoNumero = sc.nextInt();
				} while (novoNumero < 0);
				n1.setValor(novoNumero);
				System.out.println("Numero alterado com sucesso ");
				break;
			case 3:
				int fatorial = n1.calcularFatorial();
				System.out.println("O fatorial de " + n1.getValor() + " é " + fatorial);
				break;
			case 4:
				int somatorio = n1.calcularSomatorio();
				System.out.println("O somatorio de " + n1.getValor() + " é " + somatorio);
				break;
			case 5:
				int quantidade = n1.contarMultiplos();
				System.out.println("A quantidade de multiplos: " + quantidade);
				break;
			case 6:
				System.out.println("O número " + n1.verificarSeEPrimo());
				break;
			case 0:
				System.out.println("Sistema encerrado");
				break;
			default:
				System.out.println("Opcao inválida!");
			}
		} while (escolha != 0);

		sc.close();
	}

}
