package app;

public class Produto {

	private String nome;
	private double precoUnico;
	private int quantidade;

	//******************************

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoUnico() {
		return precoUnico;
	}

	public void setPrecoUnico(double precoUnico) {
		this.precoUnico = precoUnico;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double calcularTotal() {
		return this.quantidade * this.precoUnico;
	}

	@Override
	public String toString() {
		return "\nProduto" + this.nome + ", custa R$ " + this.precoUnico + ", quantidade=" + this.quantidade + "unidade(s)";
	}

}
