package app;

public class Program {

	public static void main(String[] args) {
		
		caixa c1 = new caixa();
		
		c1.numeroCaixa = 01;
		c1.meta = 10000;
		c1.iniciarDia();
		
		c1.passarCompras();

		c1.encerrarDia();

	}

}
