/*
Outro exemplo de Classe Final
*/
package heranca2;
public class Tecnico extends Aluno{
    private String registroProfissional;

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    public void praticar(){
        System.out.println("Aluno é técnico em: " + this.getCurso());
    }
    
}
