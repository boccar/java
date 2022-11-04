package app;

public abstract class Veiculo {
	// objetos da classe
	protected String nome;
	protected int anoFabricacao;
	protected int capacidade;
	protected String fabricante;

	// contrutor da classe
	public Veiculo(String nome, int anoFabricacao, int capacidade, String fabricante) {
		this.nome = nome;
		this.anoFabricacao = anoFabricacao;
		this.capacidade = capacidade;
		this.fabricante = fabricante;
	}

	

	// metodos da classe
	public String acelerar() {
		return "Acelerar";
	}

	// metodos da classe
	public String MostrarDetalhes() {
		return "MostrarDetalhes";
	}

	// get e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Veiculo: nome = " + nome + ",\nanoFabricacao = " + anoFabricacao + ", capacidade = " + capacidade
				+ ", fabricante = " + fabricante + "]";
	}

}
