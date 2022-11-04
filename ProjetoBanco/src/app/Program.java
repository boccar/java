package app;

public class Program {

	static int op;

	public static void main(String[] args) {
		Conta cont1 = new Conta(123456789, "cc", "Pietra", 0, false);
		System.out.println("*************START**************");

		do {
			System.out.println("*****OPERACOES*****\n");
			System.out.println("1 para abrir conta\n");
			System.out.println("2 para fechar conta\n");
			System.out.println("3 para depositar\n");
			System.out.println("4 para sacar\n");
			System.out.println("5 para pagar mensalidade\n");
			System.out.println("6 para sair");
			switch (op) {
			case 1:
				cont1.abrirConta(null);
			case 2:
				cont1.fecharConta();
			case 3:
				cont1.depositar(10);
			}
		} while (op != 6);

	}
}
