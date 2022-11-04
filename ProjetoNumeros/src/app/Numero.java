package app;

public class Numero {

	private int valor;
	
	public Numero(int valor) {
			this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	
	public int cacularFatorial() {
		int count = 1;
		int fatorial = 1;
	
	
	do {
		fatorial = fatorial * count;
		count = count + 1;
		
		}while(count<=this.valor);
		return fatorial;
	}
	public int cacularSoma() {
		int count = 1;
		int soma = 1;
	
	
	do {
		soma = soma + count;
		count = count + 1;
		
		}while(count<=this.valor);
		return soma;
	}	
	
	public int calcularMultiplos() {
		int count = 1;
		int multiplo = 1;
		
	do {
		multiplo = multiplo % count;
		count = count + 1;
			
		}while(count<=this.valor);
		return multiplo;
	}
		
    
	

}