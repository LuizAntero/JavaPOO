/*
Aqui nós temos o conceito de Herança para Diferença em que a classe Aluno, além
de herdar a classe Pessoa, terá seus próprios atributos e métodos.
Aluno é uma especialiação de Pessoa e Pessoa é uma generalização de Aluno.
Seu eu utizar "public final class Aluno extends Pessoa", eu estou declarando
que a classe Aluno não vai gerar subclasses. O mesmo vale para declaração nos
métodos.
*/
package heranca2;
public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void pagarMensalidade(){
        /*o modo de visualização de Pessoa está protected. Assim Aluno e a 
        própria classe Pessoa tem acesso ao atributo nome.*/
        System.out.println("Pagando mensalidade de aluno: " + this.nome);
    }
    
}
