package app;

public class Studant {

	private String alunoNome;
	private double nota1; // 30MAX 18=60%
	private double nota2; // 35MAX 21=60%
	private double nota3; // 35MAX 21=60%
	private double notaFinal; // 100MAX 60=60%

	public String getAlunoNome() {
		return alunoNome;
	}

	public void setAlunoNome(String alunoNome) {
		this.alunoNome = alunoNome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	public void calularFinal() {
		this.setNotaFinal((this.getNota1() + this.getNota2() + this.getNota3()) / 3);
		System.out.println("Nota final: " + this.getNotaFinal() + " minimo aceitavel: 20, Maximo: 60");
		if (this.getNotaFinal() >= 20) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			double faltou;
			faltou = 20 - this.getNotaFinal();
			System.out.println("Faltou: " + faltou);
		}
	}

}
