package heranca;
/*Aplicamos o conceito de Herança (extends) que é criação de uma nova classe adquirindo
atributos e métodos de uma superclasse previamente existente*/
public class Heranca {
    public static void main(String[] args) {
       //Declarando novos objetos de cada classe
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       //setando o nome
       p1.setNome("Pedro Coelho");
       p2.setNome("Larissa");
       p3.setNome("José");
       p4.setNome("Bárbara");
       
       p1.setSexo("M");
       p4.setSexo("F");
       p2.setIdade(18);
       
       p2.setCurso("Informática");
       p3.setSalario(2800.75);
       p4.setSetor("Estoque");
       
       /*Aqui temos exemplos de linhas inválidas porque os métodos não existem
       para na classe desses objetos.
       p1.receberAumento(550,30);
       p2.mudarTrabalho();
       p4.cancelarMatr();
       */
       
       //setando os métodos específicos de cada classe
       p2.setCurso("Química");
       p3.setSalario(5000);
       p3.receberAume(500);
       p4.setSetor("Secretaria");
       
       System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
       System.out.println(p4.toString());
       
    }
    
}
