package app;

public class Barco extends Veiculo {
	private int NumVelas = 2;

	
	
	

	public Barco(String nome, int anoFabricacao, int capacidade, int numVelas, String fabricante) {
		super(nome, anoFabricacao, capacidade, fabricante);
		
		NumVelas = numVelas;
	}

	public String IcarVelas() {
		return null;

	}

	public String RecolherVelas() {
		return null;
	}

	public int getNumVelas() {
		return NumVelas;
	}

	public void setNumVelas(int numVelas) {
		NumVelas = numVelas;
	}

	@Override
	public String toString() {
		return "Barco [NumVelas=" + NumVelas + "]"
				+ super.toString();
	}

}
