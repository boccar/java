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
	
	public int calcularFatorial() {
		int cont = 1;
		int fatorial = 1;
		
		do {
			fatorial = fatorial * cont;
			cont = cont + 1;
			
		}while(cont<= this.valor);
		
		return fatorial;
	}
	
	public int calcularSomatorio() {
		int cont = 1;
		int soma = 0;
		
		do {
			soma = soma + cont;
			cont = cont + 1;
			
		}while(cont<= this.valor);
		
		return soma;
	}
	public int contarMultiplos() {
		int cont = 1;
		int contMultiplos = 0;
		
		do {
			if(this.valor%cont == 0) {
				contMultiplos++;
			}
			cont++;
			
		}while(cont<= this.valor);
		
		return contMultiplos;
	}
	public String verificarSeEPrimo() {
		
		int contM = contarMultiplos();
		
		if(contM == 2) {
			return this.valor + "É PRIMO";
		}else {
			return this.valor + "É COMPOSTO";
		}
		
	}
}
