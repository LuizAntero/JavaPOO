/*
 Crio uma subclasse Mamífero herdando atributos e métodos de Animal.
Consequentemente vai herdar os métodos abstratos que serão sobrescritos
*/
package polimorfismo;
public class Mamifero extends Animal{
    private String corPelo;
    
    //Os métodos abstratos de Animal estão sendo especificados aqui em mamíferos
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
     System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
      System.out.println("Som de Mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

   
    
}
