package leitura;
public class Leitura {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];
        
        p[0] = new Pessoa("Peter", 25, "Male");
        p[1] = new Pessoa("Suzan", 19, "Female");
        
        /*Percebe que aqui criamos um vetor de um novo objeto da classe Livro
        e o método construtor dessa classe vai solicitar o leitor no último
        parâmetro justamente por que fizemos uma agregação da classe Pessoa na
        classe livro
        */
        l[0]= new Livro("POO em Java", "Walter Bridges", 300, p[0]);
        l[1]= new Livro("Java Fundamentos", "Marc Fischer", 400, p[1]);
        
        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        l[0].voltarPag();
        l[0].avancarPag();
        
        System.out.println(l[0].detalhes());
        
        l[1].abrir();
        l[1].folhear(400);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
        
    }
    
}
