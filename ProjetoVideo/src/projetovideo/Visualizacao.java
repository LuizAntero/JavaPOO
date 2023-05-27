package projetovideo;
/*Aqui estamos aplicando o conceito de relacionamento entre classe por 
agregação. Será atributo da classe Visaulização a instância da classe Video e
a instância da classe Expectador. A intenção é ter uma classe onde podemos 
aglutinar as características e comportamentos das duas classes.
*/
public class Visualizacao {
    private Expectador observer;
    private Video filme;

    public Visualizacao(Expectador observer, Video filme) {
        this.observer = observer;
        this.filme = filme;
        /*acoplando métodos das classes Expectador e Video para contar
        quantas vezes o observer viu um vídeo e quantas views um vídeo teve*/
        this.observer.setTotAssistido(this.observer.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
      

    public Expectador getObserver() {
        return observer;
    }

    public void setObserver(Expectador observer) {
        this.observer = observer;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "observer=" + observer + 
                ", filme=" + filme + 
                "\n, views=" + this.filme.getViews() + 
                "\n, total que assistiu=" + this.observer.getTotAssistido() + 
                '}';
    }
    
    /*Vamos inserir aqui o conceito de polimorfismo de sobrecarga que é quando
    eu utilizo um mesmo nome de método com assinaturas diferentes, ou seja, 
    com quantidade e tipos de dados específicos nos parâmetros desse método.    
    */
    
    public void avaliar(){
        this.filme.setAvaliacao(5);
        //System.out.println("Avaliação expectador: " + this.filme.getAvaliacao());
    }
    
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
        //System.out.println("Avaliação expectador: " + this.filme.getAvaliacao());
    }
    
    public void avaliar(float porc){
        int tot = 0;
        if (porc <=30){
            tot = 3;
        } else if (porc <=50){
            tot = 5;
        } else if (porc <=90){
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
        // System.out.println("Avaliação expectador: " + this.filme.getAvaliacao());
        
    }
}
