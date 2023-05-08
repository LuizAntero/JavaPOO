package relacaoclasses;
public class Lutador {
    //Classe encapsulada (atributos com visibilidade private)
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Método construtor
    public Lutador(String no, String na,int id, float al, float pe, int vi,
            int de, int em){
        this.nome=no;
        this.nacionalidade=na;
        this.idade=id;
        this.altura=al;
        //se eu colocar this.peso=pe, o java não calculca a categoria e devolve null 
        this.setPeso(pe);
        this.vitorias=vi;
        this.derrotas=de;
        this.empates=em;        
    }
    
    //Métodos getter and setter
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }
    
    /*Aqui temos uma INTERAÇÃO entre os métodos modificadores peso e categoria
    Sempre que eu configurar o peso, eu também vou configurar a categoria
    O peso vai receber um valor double que vai ser tratado no método 
    setCategoria*/    
    public void setPeso(float pe) {
        this.peso = pe;
        /*O setCategoria será somente um método interno da classe. Não usaremos
        do lado de fora. Portanto, limpamos o parâmetro dele. Ele vai se
        referenciar (depender) do peso. Ou seja, conforme mudo o peso, muda a
        categoria. Podemos afirmar que o parâmetro dele passa a ser o peso*/
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    
    /*Sempre que necessário podemos adicionar linhas nos métodos modificadores
    O setCatoria não vai receber parâmetro, porque o parâmetro dele já vai ser
    do setPeso.*/
    private void setCategoria() {
        if(this.peso <52.2){
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3){
            this.categoria = "Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Médio";
        } else if(this.peso <=120.2) {
            this.categoria = "Pesado";
        } else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    //Método públicos
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+ 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    public void apresentar(){
        System.out.println("-------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador" + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e " + this.getAltura() + "m");
        System.out.printf("Pesando: %.2f" , this.getPeso());
        System.out.println("Kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }
    
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("com " + this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas e");
        System.out.println("e " + this.getEmpates() + " empates!");
    }
    
    
    
    
}
