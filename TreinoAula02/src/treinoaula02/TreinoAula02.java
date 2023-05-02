package treinoaula02;
public class TreinoAula02 {
        public static void main(String[] args) {
        //Instanciando um novo objeto
        Carro c1 = new Carro();
        //Definindo atributos
        c1.marca = "Audi";
        c1.modelo = "A5 RS";
        c1.cor = "Branco";
        c1.potencia = 250;
        //Definindo métodos (coisas que faço)
        c1.ligado();
        c1.andar();
        c1.status();
        
        Carro c2 = new Carro();
        c2.marca = "BMW";
        c2.modelo = "320 i";
        c2.cor = "Preto";
        c2.potencia = 280;
        c2.desligado();
        c2.andar();
        c2.status();        
        
    }
    
}
