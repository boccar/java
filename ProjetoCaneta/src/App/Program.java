package App;

public class Program {

	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		c1.modelo = "Mark 1";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.carga = 100;
		
		c1.destampar();
		c1.status();
		c1.rabiscar();

		System.out.println("********************");
		
		Caneta c2 = new Caneta();
		c2.modelo = "Mark 2";
		c2.cor = "Preta";
		c2.ponta = 1f;
		c2.carga = 100;
		
		c2.tampar();
		c2.status();
		c2.rabiscar();
	}

}
