package projetovideo;
public class ProjetoVideo {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de Java");
        v[1] = new Video("Fundamentos Java");
        v[2] = new Video("POO em Java");
        
        /*linha inválida. Pessoa é abstrata, ela vai herdar para expectador
        Pessoa p = new Pessoa();*/
        
        Expectador e[] = new Expectador[3];
        e[0]= new Expectador("Luiz Carlos", 38, "M", "Java123");
        e[1]= new Expectador("Aline", 27, "F", "Ali2023");
        e[2]= new Expectador("Fernanda", 20, "F", "Fe123");
        
        /*
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println(e[1].toString());
        */
        
        /*Na agregação eu consigo inserir a instancia de uma classe como atributo
        de uma outra classe, no caso Visualizacao, para linkar as duas classes,
        no caso, as classes Expectador e Video*/
        
        Visualizacao[] vi = new Visualizacao[4];
        vi[0] = new Visualizacao(e[0], v[2]);//Luiz Carlos assiste POO em Java
        vi[0].avaliar();
        System.out.println(vi[0].toString());
        
        vi[1] = new Visualizacao(e[0], v[1]);//Luiz Carlos assiste Fundamentos Java
        vi[1].avaliar(87.0f);
        System.out.println(vi[1].toString());
        
        vi[2]= new Visualizacao(e[1], v[2]);//Aline assiste POO em Java
        vi[2].avaliar(8);
        System.out.println(vi[2].toString());
        
        /*Luiz Carlos e Aline assistiram o vídeo POO em Java e deram suas 
        avaliações. Luiz deu 5+1(predefinido no construtor) e Aline deu 8
        conforme programamos no método de avalição da classe Video, temos
        uma média de avaliação (total de avalições por views), ou seja, 6+8/2
        resultando 7 na avaliação do vídeo POO em Java
        */ 
        
        vi[3]= new Visualizacao(e[0], v[1]);
        vi[3].avaliar(7);
        System.out.println(vi[3].toString());
        
        
        
        
        
        
    }
    
}
