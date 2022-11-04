package App;

public class Program {

	public static void main(String[] args) {

		Caneta c1 = new Caneta();
		c1.modelo = "BIC cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f;
		c1.carga = 100;
		c1.tampa = true;
		c1.status();
	}

}
