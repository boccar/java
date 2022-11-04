package app;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		artistaria a1 = new artistaria();

		int op;

		do {
			System.out.println("DIGITE");
			System.out.println("1 - Cadastrar artista");
			System.out.println("2 - Visualizar artistas");
			System.out.println("3 - Ver quantidade de artistas");
			System.out.println("4 - Apagar todos os artistas");
			System.out.println("5 - Buscar artista");
			System.out.println("0 - Sair");
			op = sc.nextInt();
			switch (op) {
			case 1:
				artista p1 = new artista();
				System.out.println("Digite o nome do artista: ");
				sc.nextLine();
				p1.setNome(sc.nextLine());
				do {
					System.out.println("Digite o album: ");
					p1.setAlbum(sc.next());

				} while (p1.getAlbum() == null);

				a1.adicionarArtista(p1);
				System.out.println("Cadastrar com sucesso!");
				break;
			case 2:
				if (a1.getLista().isEmpty()) {
					System.out.println("Nao ha artistas");
				} else {
					a1.verTodos();
				}
				break;
			case 3:
				System.out.println("Total de cadastros: " + a1.obterQuantidadeDeArtista());
				break;
			case 4:
				if (a1.getLista().isEmpty()) {
					System.out.println("Nao ha artistas para excluir.");
				} else {
					int confirma;
					System.out.println("Tem certeza que deseja EXCLUIR TUDO?\n1-SIM\n2-NAO");
					confirma = sc.nextInt();
					if (confirma == 1) {
						a1.apagarTudo();
						System.out.println("Produtos excluidos com sucesso");
					} else {
						System.out.println("Opcao cancelada.");
					}
				}
				break;
			case 5:
				String nome;
				System.out.println("Digite o nome do artista: ");
				sc.nextLine();
				nome = sc.nextLine();
				a1.buscarArtisa(nome);
				break;
			case 0:
				System.out.println("Sistema encerrado.");
				break;
			default:
				System.out.println("Opcao invalida.");
			}
		} while (op != 0);

		sc.close();
	}

}
