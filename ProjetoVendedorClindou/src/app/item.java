package app;

public class item {

	private String nomeItem;
	private int espaco;
	private int preco;

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public int getEspaco() {
		return espaco;
	}

	public void setEspaco(int espaco) {
		this.espaco = espaco;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "item [nomeItem=" + nomeItem + ", espaco=" + espaco + ", preco=" + preco + "]";
	}

}
