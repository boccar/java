package App;

public class Caneta {

	public String modelo;
	public String cor;
	public float ponta;
	int carga;
	boolean tampa;

	public void rabiscar() {
		if (this.tampa == true) {
			System.out.println("Nao pode rabiscar");
		} else {
			System.out.println("Pode rabiscar");
		}

	}

	void tampar() {
		this.tampa = true;
	}

	void destampar() {
		this.tampa = false;
	}

	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("A carga e de: " + this.carga);
		System.out.println("Esta tampada? " + this.tampa);

	}

}
