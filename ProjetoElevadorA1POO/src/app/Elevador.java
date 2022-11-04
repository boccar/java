package app;

public class Elevador {

	private int andarAtual;
	private int andarTotal;
	private int pessoasTotal;
	private int pessoasAtual;

	public Elevador(int pessoasTotal, int andarTotal, int andarAtual) {
		this.pessoasTotal = pessoasTotal;
		this.andarTotal = andarTotal;
		this.andarAtual = andarAtual;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getAndarTotal() {
		return andarTotal;
	}

	public void setAndarTotal(int andarTotal) {
		this.andarTotal = andarTotal;
	}

	public int getPessoasTotal() {
		return pessoasTotal;
	}

	public void setPessoasTotal(int pessoasTotal) {
		this.pessoasTotal = pessoasTotal;
	}

	public int getPessoasAtual() {
		return pessoasAtual;
	}

	public void setPessoasAtual(int pessoasAtual) {
		this.pessoasAtual = pessoasAtual;
	}

	public void status() {
		System.out.println("Andar atual: " + this.andarAtual);
		System.out.println("Pessoas atuais: " + this.getPessoasAtual() + "\n");
		
		
	}

	public void entra() {
		if (this.pessoasAtual < this.getPessoasTotal()) {
			this.setPessoasAtual(this.getPessoasAtual() + 1);
			System.out.println("Uma pessoa entrou");
		} else {
			System.out.println("Elevador cheio");
		}

	}

	public void sai() {
		if (this.pessoasAtual > 0) {
			this.setPessoasAtual(this.getPessoasAtual() - 1);
			System.out.println("Uma pessoa saiu");
		} else {
			System.out.println("Nao ha pessoas no elevador, anta.");
		}
	}

	public void sobe() {
		if (this.andarAtual != this.getAndarTotal()) {
			this.setAndarAtual(this.getAndarAtual() + 1);
			System.out.println("O elevador subiu 1 andar");
		} else {
			System.out.println("O elevador esta no andar " + this.getAndarTotal() + " que e o andar maximo");
		}

	}

	public void desce() {
		if (this.andarAtual > 0) {
			this.setAndarAtual(this.getAndarAtual() - 1);
			System.out.println("O elevador desceu 1 andares");
		} else {
			System.out.println("O elevador esta no andar 0");
		}
	}

}
