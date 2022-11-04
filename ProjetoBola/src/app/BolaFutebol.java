package app;

public class BolaFutebol extends Bola{
	
	private String tipo;

	public BolaFutebol(String tipo,int tamanho, String cor) {
		super(cor, tamanho);
		this.tipo = tipo;
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println(tipo);
	}
	
	
	
	

}
