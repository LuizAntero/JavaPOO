package polimorfismo;
public class Canguru extends Mamifero{
    //o Canguru vai sobrepor o método locomover com o resultado "saltando"
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
}
