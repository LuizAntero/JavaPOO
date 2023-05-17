/*
A temos o exemplo de uma Classe Final (não herda para outras classes). É 
obrigatóriamente folha. Está herdando tudo o que é de Aluno e por consequência
da classe Pessoa as well.
*/
package heranca2;
public class Bolsista extends Aluno{
    private float bolsa;
    
    public float getBolsa(){
        return bolsa;
    }
    
    public void setBolsa(float bolsa){
        this.bolsa = bolsa;
    }
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome);
    }
    
    /*nota que o sistema avisa que esse método é sobrescrito da classe Aluno.
    Ou seja, vamos reutilizá-lo aqui com outro funcionalidade (polimorfismo)*/
    @Override
    public void pagarMensalidade(){
       System.out.println(this.nome + " é bolsista! Pagamento facilitado.") ;
    }
    
}
