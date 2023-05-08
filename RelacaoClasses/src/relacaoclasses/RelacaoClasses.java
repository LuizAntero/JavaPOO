package relacaoclasses;
public class RelacaoClasses {
    public static void main(String[] args) {
      
      //Demonstração de um objeto dentro de um vetor
      Lutador[] l = new Lutador[6];
      l[0] = new Lutador("Anderson", "Brasil", 31, 1.75f, 68.9f, 10, 10,10);
      l[1] = new Lutador("Bob", "Canada", 29, 1.68f, 57.8f, 20, 20, 20);
      l[2] = new Lutador("Jack", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
      l[3] = new Lutador("Lenny", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
      l[4] = new Lutador("Lyoto", "Brasil", 32, 1.79f, 108.5f, 15, 3, 1);
      l[5] = new Lutador("Peter", "Inglaterra", 32, 60.8f, 115.6f, 9, 2, 2);
      
      /*Além de atribuir valores no mét. const., posso invocar o mét. modif.
      l[3].setPeso(10f);
      l[3].setDerrotas(10);      
      l[3].status();      
      
      Lutador l = new Lutador("Pretty Boy", "França", 31, 1.75f, 619.9f, 11, 2, 1);
      l.apresentar();
      l.status();
      }
      */
      
      Luta ufc01 = new Luta();
      ufc01.marcarLuta(l[4], l[5]);
      ufc01.lutar();
      
      
      /*Luta ufc02 = new Luta();
      ufc02.marcarLuta(l[0], l[1]);
      ufc02.lutar();
      l[0].status();
      l[1].status();
      */
     
   
      
      
    
    } 
}
