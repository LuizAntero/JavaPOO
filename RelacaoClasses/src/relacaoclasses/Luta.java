package relacaoclasses;

import java.util.Random;

public class Luta {
    /*Percebe que aqui estamos fazendo uma agregação da classe Lutador com a 
    classe Luta.
    É um relacionamento do tipo "tem um". Ou seja, a classe Luta tem um atributo
    da classe Lutador.*/
     private Lutador desafiado;
     private Lutador desafiante;
     //Aqui são demais atributos
     private int rounds;
     private boolean aprovada;
     
     
     /*Método especiais. Repare o métodos get e set da agregação
     getDesafiado returna um tipo Lutador*/
     public Lutador getDesafiado(){
         return this.desafiado;
     }
     
     /*Percebe que aqui ele retorna não um tipo primitivo mas um tipo abstrato 
     de dado
     setDesafiado recebe um tipo Lutador*/     
     public void setDesafiado(Lutador desafiado){
         this.desafiado=desafiado;
     }
     
     public Lutador getDesafiante(){
         return this.desafiante;
     }
     
     public void setDesafiante(Lutador desafiante){
         this.desafiante=desafiante;
     }
     
     //Métodos especiais padrão
     public int getRounds(){
         return this.rounds;
     }
    
     public void setRounds(int round){
         this.rounds = round;
     }
     
     public boolean getAprovada(){
         return this.aprovada;
     }
     
     public void setAprovada(boolean aprov){
         this.aprovada = aprov;
     }
     
     //Métodos específicos
     /*Regras da luta:
     1-Só pode ser marcada entre lutadores da mesma categoria
     2-Desafiado e desafiante devem ser lutadores diferentes
     3-Só pode acontecer se estiver aprovada
     4-Só pode ter como resultado a vitória de um dos lutadores ou o empate.*/
     
     public void marcarLuta(Lutador l1, Lutador l2){
         /*Estabelecendo condicional para que a categoria seja a mesma e 
         os lutadores sejam diferentes.
         l1 e l2 são os parâmetro que vou alimentar no método marcarLuta
         para os objetos desafiado e desafiante*/
         if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
             this.aprovada= true;
             //se a luta for aprovada o desafiado é o l1 e o desafiante é o l2
             this.desafiado = l1;
             this.desafiante = l2;
             System.out.println("Luta aprovada.");
         } else {
             setAprovada(false);
             setDesafiado(null);
             setDesafiante(null);
         }         
     }
     
     public void lutar(){
         /* para chamar o método específico lutar, eu estabeleço a condicional 
         sobre o atributo aprovada ser verdadeiro. Ou seja, tenho que invocar o
         método marcarLuta antes.
         Crio uma var aleatória entre 0 e 2 para jogar o resultado da luta
         e aplico uma condicional switch de múltipla escolha para tratar o
         resultado e invocar os métodos de empate, vitória e derrota lá da classe
         lutador. É fenomenal como vemos interação entre as classes justamente
         por utilizarmos os tipos abstrados de dados nos atributos lá em cima
         que nada mais são do que instâncias da classe Lutador.
         */
         
         
         double ale = Math.random();       
         
        if (this.aprovada){
            System.out.println("###DESAFIADO###");
             this.desafiado.apresentar();
             System.out.println("###DESAFIANTE###");
             this.desafiante.apresentar();   
            System.out.println("=======RESULTADO DA LUTA======");
            int resultado = (int)(0 + ale*(3-0));
            switch (resultado){
                case 0:
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitória do: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitória do: " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("==========================");
        }   else {
                System.out.println("Luta não pode acontecer.");
                } 
     }
     
     
}
