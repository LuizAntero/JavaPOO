/*
 A classe Professor é mais um exemplo de Herança para Diferença.
*/
package heranca2;
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void receberAumento(float valor){        
        this.setSalario(this.getSalario()+valor);
        System.out.println("Salário ajustado: " + this.getSalario());
    }
    
}
