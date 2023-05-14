package heranca;

//Criando a nossa superclasse
public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public String GetNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int id){
        this.idade = id;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo (String sex){
        this.sexo = sex;
    }
    
    public void fazerAniv(){
        this.idade ++;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + 
                ", sexo=" + sexo + '}';
    }
    
    
    
}
