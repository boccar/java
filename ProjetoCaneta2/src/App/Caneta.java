package App;

public class Caneta {

	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampa;

	public void rabiscar() {
		if (this.tampa == true) {
			System.out.println("Nao pode rabiscar");
		} else {
			System.out.println("Pode rabiscar");
		}

	}

	protected void tampar() {
		this.tampa = true;
	}

	protected void destampar() {
		this.tampa = false;
	}

	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor: " + this.cor);
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Tampada? " + this.tampa);

	}

}
