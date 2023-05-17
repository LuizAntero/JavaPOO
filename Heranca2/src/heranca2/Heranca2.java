package heranca2;
/*Neste projeto vamos ter uma abordagem mais avançada sobre os conceitos de 
herança. Vamos aplicar super-classe, sub-classe, Ancestral, Descendente, 
Classe raiz, Classe Folha, Generalização, Especialização, Tipos de Herança,
Classe abstratada, Método abstrato, Classe final e Método Final*/
public class Heranca2 {
    public static void main(String[] args) {
        //Testando novo objeto para classe abstrata Pessoa (deu linha inválida)
        //Pessoa p1 = new Pessoa(); 
        
        Visitante v1 = new Visitante();
        v1.setNome("Clarisse");
        v1.setIdade(28);
        v1.setSexo("F");
        System.out.println(v1.toString());        
        
        Aluno a1 = new Aluno();
        a1.setNome("Laura");
        a1.setMatricula(5555);
        a1.setCurso("Matemática");
        a1.setIdade(18);
        a1.setSexo("F");
        //Perceba o método pagarMensalidade() da classe Aluno e da Bolsista
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(3333);
        b1.setNome("Marcos");
        b1.setBolsa(15.5f);
        //Perceba a sobreposição aqui (@Override)
        b1.pagarMensalidade();
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Paulo");
        t1.setIdade(30);
        t1.setSexo("M");
        t1.setCurso("Mecatrônica");
        t1.praticar();
        
        Professor p1 = new Professor();
        p1.setNome("Alexa");
        p1.setIdade(33);
        p1.setSexo("F");
        p1.setEspecialidade("Biologia");
        p1.setSalario(5000.56f);
        System.out.println(p1.toString());
        p1.receberAumento(300.03f);
        
        
        
        
        
        
                
    }
    
}
