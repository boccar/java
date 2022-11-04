package app;

public class pessoa {

	private String nome;
	private int idade;
	private char sexo;
	private endereco end;

	public pessoa(String nome, int idade, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public endereco getEnd() {
		return end;
	}

	public void setEnd(endereco end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo() + "\n";
	}

}
