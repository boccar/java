package app;

public class Automovel extends Veiculo {
	// objetos da classe
	private int DiametroRoda;

	public Automovel(String nome, int anoFabricacao, int capacidade, int diametroRoda, String fabricante) {
		super(nome, anoFabricacao, capacidade, fabricante);
		DiametroRoda = diametroRoda;
	}

	// metodo da classe
	public String AbrirPortaMalas() {
		return null;
	}

	// get e sets da classe
	public int getDiametroRoda() {
		return DiametroRoda;
	}

	public void setDiametroRoda(int diametroRoda) {
		DiametroRoda = diametroRoda;
	}

	@Override
	public String toString() {
		return String.format(
				super.toString()); 
				
	}



}
