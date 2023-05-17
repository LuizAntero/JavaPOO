/*
 A classe Pessoa será uma super-classe (vai herdar seus métodos e atributos).
Será uma generalização das demais classes (é a raiz). Será abstrata (não gera
novo objeto). Será a ancestral de bolsita e técnico. */
package heranca2;
/*Declaramos abstract class e seus métodos abstratados (não implementados na 
progenitora*/
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    
    public void fazerAniversario(){
        this.idade ++;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + 
                ", sexo=" + sexo + '}';
    }
    
    
}
