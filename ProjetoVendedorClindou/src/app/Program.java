package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		loja l1 = new loja();

		int op;

		do {
			System.out.println("DIGITE");
			System.out.println("1 - cadastrar item");
			System.out.println("2 - ver todos");
			System.out.println("3 - vender");
			System.out.println("4 - ");
			System.out.println("5 - ");
			System.out.println("0 - Sair");
			op = sc.nextInt();
			switch (op) {
			case 1:
				l1.cadastrarItem();
				l1.adicionarProduto(null);
				break;
			case 2:
				l1.verTodos();
				break;
			case 3:
				l1.vender();
				break;
			case 4:

				break;
			case 5:

				break;
			case 0:
				System.out.println("Sistema encerrado.");
				break;
			default:
				System.out.println("Opcao invalida.");
			}
		} while (op != 0);

	}

}
