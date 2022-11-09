package app;

public class notas {

    private double nota1, nota2, nota3, notaFinal, media;

    public void setMedia(double media) {
        this.media = media;
    }

    public double getMedia() {
        return media;
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
        System.out.println("Nota final: " + this.getNotaFinal() + " minimo aceitavel: " + getMedia() + ", Maximo: 100");
        if (this.getNotaFinal() >= getMedia()) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            double faltou;
            faltou = getMedia() - this.getNotaFinal();
            System.out.println("Faltou: " + faltou);
        }
    }

}
