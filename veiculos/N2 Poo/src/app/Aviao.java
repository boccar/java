package app;

public class Aviao extends Veiculo {
	private int NumTurbinas = 2;

	public Aviao(String nome, int anoFabricacao, int capacidade, int numTurbinas, String fabricante) {
		super(nome, anoFabricacao, capacidade, fabricante);
		NumTurbinas = numTurbinas;
	}

	public String Decolar() {
		return null;

	}

	public String Pousar() {
		return null;

	}

	public int getNumTurbinas() {
		return NumTurbinas;
	}

	public void setNumTurbinas(int numTurbinas) {
		NumTurbinas = numTurbinas;
	}

}
