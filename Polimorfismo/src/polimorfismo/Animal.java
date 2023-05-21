/*Criando a superclasse abstrata (não gera objeto) Animal com seus atributos
protegidos, ou seja, eu permito que uma subclasse extenda a classe Animal e
acesse os atributos da superclasse.
*/
package polimorfismo;
public abstract class Animal {
    //Atributos de Animal
    protected float peso;
    protected int idade;
    protected int membros;
    
    //Métodos de Animal (abstratos: somente as filhas desenvolvem esses métodos)
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
    
}
