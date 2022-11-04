package app;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Editora e1 = new Editora();
		
		Livro l1 = new Livro();

		System.out.println("***********************************");
		System.out.println("* Bem vindo a biblioteca do Jorge *");
		System.out.println("***********************************\n");
		
		int op;

		do {
			System.out.println("DIGITE:");
			System.out.println("1 - Cadastrar editora");
			System.out.println("2 - Cadastrar livro");
			System.out.println("3 - Ver a editora e livro");
			System.out.println("0 - Sair do sistema");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Digite o nome da editora que quer cadastrar: ");
				e1.setNome(sc.next());
				System.out.println("Digite o e-mailda editora: ");
				e1.setEmail(sc.next());
				System.out.println("Digite o id da editora: '5 digitos'");
				e1.setId(sc.nextLong());
				System.out.println("Editora " + e1.getNome() + " cadastrada com sucesso :) ");
				break;
			case 2:
			
				System.out.println("Digite o titulo do livro que quer cadastrar: ");
				l1.setTitulo(sc.next());
				System.out.println("Digite o autor: ");
				l1.setAutor(sc.next());
				System.out.println("Digite o id da editora: '5 digitos'");
				l1.setIdEditora(sc.nextInt());
				System.out.println("Digite o ano: ");
				l1.setAno(sc.nextInt());
				System.out.println("O livro " + l1.getTitulo() + " de " + l1.getAutor() + " foi cadastrado com sucesso :) ");
				break;
			case 3:
				
				if(l1.getTitulo() == null) {
				System.out.println("Nao ha livros cadastrados");
				}else {
					System.out.println("Livro: " + l1.getTitulo() + "\nAutor: " + l1.getAutor() + "\nAno: " + l1.getAno() + "\nEditora: " + e1.getNome());
				}
				
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
