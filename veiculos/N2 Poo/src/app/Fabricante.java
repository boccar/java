package app;

public class Fabricante {
	private String nomeFab;
	private String paisDeOrigem;
	
	
	public Fabricante(String nomeFab, String paisDeOrigem) {
		this.nomeFab = nomeFab;
		this.paisDeOrigem = paisDeOrigem;
	}
	public String getNomeFab() {
		return nomeFab;
	}
	public void setNome(String nomeFab) {
		this.nomeFab = nomeFab;
	}
	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}
	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}
	@Override
	public String toString() {
		return "Fabricante [nome=" + nomeFab + ", paisDeOrigem=" + paisDeOrigem + "]";
	}
	
	
}
