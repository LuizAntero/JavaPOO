package treinoaula02;
//CLASSE
public class Carro {
    //ATRIBUTO
    String marca;
    String modelo;
    String cor;
    Integer potencia;
    Boolean abastecido;
    
    //ESTADO
    void status(){
        //this é uma referênciao ao próprio objeto que chama o método
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Potência: " + this.potencia);
        System.out.println("Está abastecido? " + this.abastecido);        
    } 
    
    /*MÉTODO
    //Para andar ele tem que está com o método ligado (significa abastecido)
    Senão ele tem que está com o método desligado (significa não abastecido)*/
    void andar(){
        if (this.abastecido == true){
            System.out.println("Pronto para andar.");
        } else {
            System.out.println("ERRO! Precisa abastecer.");
        }
    }
    
    void ligado(){
        this.abastecido = true;
    }
    
    void desligado(){
        this.abastecido = false;
    }   
}
