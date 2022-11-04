package app;

public class arma {

	private int municao;
	private int capacidade;

	public arma(int municao, int capacidade) {
		this.municao = municao;
		this.capacidade = capacidade;
	}

	public void atirar(int vezes) {
		if (this.getMunicao() >= 0 && vezes <= this.getMunicao()) {
			System.out.println("Disparo(s) efetuado");
			this.setMunicao(this.getMunicao() - vezes);
		} else if (vezes < this.getMunicao()){
			System.out.println("Sem munição, recarregue");
		} else {
			System.out.println("disparos exedem a capacidade");
		}
	}

	public void recarregar() {
		int falta;
		falta = this.getCapacidade() - this.getMunicao();
		this.setMunicao(this.getMunicao() + falta);
		System.out.println("Pente carregado");
	}
	
	public void status() {
		System.out.println("Total de balas: " + this.getMunicao() + " de " + this.getCapacidade());
	}

	public int getMunicao() {
		return municao;
	}

	public void setMunicao(int municao) {
		this.municao = municao;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
