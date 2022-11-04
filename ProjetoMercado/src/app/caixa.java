package app;

public class caixa {

	public String atendente;
	public int numeroCaixa;
	private double valorInicial = 0;
	private double valorFinal;
	public int meta;

	public void iniciarDia() {
		System.out.println("*********************");
		System.out.println("Bem vindo ao caixa " + this.numeroCaixa);
		System.out.println("Temos hoje como sua meta: R$ " + this.meta);
	}

	public void passarCompras() {
		System.out.println("Compra passada");
		this.valorFinal = valorInicial + 9000;
	}

	public void encerrarDia() {
		System.out.println("\nParabens pelo dia de vendas");
		if (this.meta == this.valorFinal) {
			System.out.println("Voce cumpriu com sua meta e vendeu: " + this.valorFinal);
		} else {
			System.out.println("Voce nao cumprio com a meta e voce vendeu: " + this.valorFinal);
		}
	}

}
