package app;

public class main {

	public static void main(String[] args) {

		arma arma = new arma(0, 30);

		arma.status();

		arma.recarregar();

		arma.atirar(20);

		arma.status();

	}

}
