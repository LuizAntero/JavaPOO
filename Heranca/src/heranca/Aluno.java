package heranca;
//Classe Aluno vai herdar todos os atributos e métodos de Pessoa
public class Aluno extends Pessoa {
    private int matr;
    private String curso;

    public int getMatr() {
        return this.matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    
    
    public void cancelarMatr(){
        System.out.print("Matrículo cancelada");
    }
    
}
