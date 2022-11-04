package app;

import java.util.ArrayList;

public class artistaria {
	private ArrayList<artista> bd;

	public artistaria() {
		bd = new ArrayList<artista>();
	}

	public ArrayList<artista> getLista() {
		return bd;
	}

	public void setLista(ArrayList<artista> lista) {
		this.bd = lista;
	}

	@Override
	public String toString() {
		return "Artista{" + "lista=" + this.bd + "}";
	}

	public void adicionarArtista(artista a1) {
		this.bd.add(a1);
	}

	public void apagarTudo() {
		this.bd.clear();
	}

	public int obterQuantidadeDeArtista() {
		return this.bd.size();
	}

	public void buscarArtisa(String nome) {
		for (int i = 0; i < bd.size(); i++) {
			artista a = bd.get(i);
			if (a.getNome().equals(nome)) {
				System.out.println(this.toString());
			}

		}

	}
	
	public void verTodos() {
		for (int i = 0; i < bd.size(); i++) {
			artista a = bd.get(i);
			System.out.println("Nome do artista: " + a.getNome()
									+ " Nome do album: " + a.getAlbum());
		}
	}
}
