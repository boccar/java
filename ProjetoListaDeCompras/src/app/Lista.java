package app;

import java.util.ArrayList;

public class Lista {

	private ArrayList<Produto> lista;

	public Lista() {
		this.setLista(new ArrayList<Produto>());
	}

	public ArrayList<Produto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Produto> lista) {
		this.lista = lista;
	}
	
	public void adicionarProduto(Produto p1) {
		this.lista.add(p1);
	}

}
