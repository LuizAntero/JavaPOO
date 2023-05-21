/*Vamos aplicar o conceito de polimorfismo que trata da utilização de um método
da superclasse para uma subclasse contendo a mesma assinatura porém trazendo
resultados diferentes.
*/
package polimorfismo;
public class Polimorfismo {
    public static void main(String[] args) {
        //esta linha é invalida porque animal não pode ser instaciada
        //Animal n = new Animal();  
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        
        //especificando atributos e aplicando métodos para o novo objeto m
        m.setPeso(40.5f);
        m.setCorPelo("Vermelho");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        /*Percebe o polimorfismo agindo aqui. Temos o mesmo método com 
        resultados diferentes */
        a.locomover();
        p.locomover();
        r.locomover();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara ar = new Arara();
        
        
        /*para o Canguru eu estou sobrepondo o método locomover e especificando
        para saltar*/
        c.locomover();
        k.locomover();
        k.emitirSom();
        
        
        
    }
    
}
