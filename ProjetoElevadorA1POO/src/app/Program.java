package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******* ELEVADOR *******");

		Elevador e1 = new Elevador(5, 7, 0);

		int op;

		do {
			System.out.println("\n****************\n");
			e1.status();
			System.out.println("1 - Chamar o elevador");
			System.out.println("2 - Entrar uma pessoa");
			System.out.println("3 - Sair uma pessoa");
			System.out.println("0 - Sair");
			op = sc.nextInt();
			switch (op) {
			case 1:
				if (e1.getAndarAtual() == 0) {
		
					e1.sobe();
					
				} else if (e1.getAndarAtual() == e1.getAndarTotal()) {
					System.out.println("O elevador descera um andar");
					e1.desce();
					
				} else {
					byte oop;
					do {

						System.out.println("Deseja subir ou descer?\n1 - para subir\n2 - para descer\n");
						oop = sc.nextByte();
						if (oop == 1) {
							e1.sobe();
						} else if (oop == 2) {
							e1.desce();
						} else {
							System.out.println("Opcao invalida");
						}
					} while (oop != 1 && oop != 2);

				}
				break;
			case 2:
				e1.entra();
				break;
			case 3:
				e1.sai();
				break;
			case 0:
				System.out.println("Sistema encerrado.");
				break;
			default:
				System.out.println("\nOpcao invalida.\n");
			}
		} while (op != 0);

		sc.close();
	}

}
