package app;

public class validar {

    public void validarMedia(double media) {
      do {
        System.out.println("Média invalida, a média deve ser entre 1 e 100");
        
      } while (media > 0 && media <= 100);
   } 
}
