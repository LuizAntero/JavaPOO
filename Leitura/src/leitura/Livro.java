package leitura;
//implementando a interface Publicação na classe Livro
public class Livro implements Publicacao {
    private String livro;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    //Relacionamento entre classes por agregação
    private Pessoa leitor;
    
    //Métodos especiais construtor e getter and setter    
    public Livro (String li, String aut, int totPag, Pessoa leitor){
        this.livro = li;
        this.autor = aut;
        this.totPaginas = totPag;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }
    
    
    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    
    //Método detalhes será visível dentro System.out.println
    public String detalhes() {
        return "Livro{" + "livro=" + livro 
                + "\n, autor=" + autor 
                + "\n, totPaginas=" + totPaginas + ", pagAtual=" + pagAtual 
                + "\n, aberto=" + aberto 
                + "\n, leitor=" + leitor.getNome() 
                + "\n, idade=" + leitor.getIdade() 
                + "\n, leitor=" + leitor.getSexo() + '}';
    }

    //Tratando os métodos declarados da interface
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    //Aqui temos uma condicional para a página atual não ultrapassar o total
    @Override
    public void folhear(int p) {
        if (this.totPaginas>=p){
            this.pagAtual = p;
        } else {
            System.out.println("Limite de páginas: " + this.totPaginas);
        }
        
    }
    
    //Aplicamos condicional para não exceder o limite de páginas
    @Override
    public void avancarPag() {
        if(this.pagAtual<this.totPaginas){
            this.pagAtual ++; 
        }else{
            System.out.println("Ops. Limite de página excedido.");
        }
              
    }

    //Aplicamos condicional para não voltar páginas abaixo de zero.
    @Override
    public void voltarPag() {
        if(this.pagAtual>0){
            this.pagAtual --;
        }else{
            System.out.println("Ops. Não há páginas para voltar.");
        }
        
    }
    
    
}
