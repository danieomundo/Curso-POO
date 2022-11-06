package ProjetoLivro;

public class Livro implements Publicacao {

    // atributos    
    private Pessoa leitor;
    private String autor;
    private String titulo;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;

    // construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;        
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }
    
     // método
    public String detalhes() { // public String toString()
        return "Título: " + this.titulo + "\nAutor: " + this.autor +  
                "\nTotal de páginas: " + this.totPaginas + "\nPágina atual: " + this.pagAtual 
                + "\nAberto: " + this.aberto + "\nLeitor: " + this.leitor.getNome()+"\n";
    }
      
    //métodos especiais
    
    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }   
    
    // sobrescrevendo Métodos Abstratos da Interface
    
    @Override   
    public void abrir(){
        this.aberto = true;
    }
   
    @Override
    public void fechar(){
        this.aberto = false;
    }
    
    @Override
    public void folhear(int p){
        this.pagAtual = p;
    }
    
    @Override
    public void avançarPag(){
        this.pagAtual++;
    }
    
    @Override
    public void voltarPag(){
        this.pagAtual--;
    }
    
 }  
    
    

