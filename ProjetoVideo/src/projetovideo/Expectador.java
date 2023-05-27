package projetovideo;
public class Expectador extends Pessoa{
    private String login;
    private int totAssistido;

    /*Como expectador herda da superclasse Pessoa, no construtor tenho que 
    passar também nome, idade e sexo*/
    public Expectador(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }

    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
    
    public void viuMaisUm(){
        
    }
    
    
    
}
