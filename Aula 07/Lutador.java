package aula07.UltraEmojiCombat;

public class Lutador {
    
    // atributos
    
    private String nome;
    private String nacionalidade;
    private int idade; 
    private float altura; 
    private float peso; 
    private String categoria;
    private int vitorias, derrotas, empates;
    
    // construtor 
   
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe); // para ser possível mudar futuramente, caso lutador tenha perdido ou ganhado peso.
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }  
    
    // métodos especiais
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria() {
       if (this.getPeso()<52.2){
           this.categoria = "Peso abaixo do permitido.";       
       } else if (this.getPeso()<=70.3){
           this.categoria = "Leve";
       } else if (this.getPeso()<=83.9){
           this.categoria = "Médio";
       } else if (this.getPeso()<=120.2) {
           this.categoria = "Pesado";
       } else {
           this.categoria = "Peso acima do permitido.";
       }
    }  

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
    
    // métodos públicos
    
    public void apresentar(){       
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade()+ " anos");
        System.out.println("Altura: " + this.getAltura() + "cm");
        System.out.println("Peso: " + this.getPeso() + "kgs");
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("");    
    }
    
    public void status(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Categoria do peso: " + this.getCategoria());
        System.out.println("Possui " + this.getVitorias() + " vitórias, ");
        System.out.println(this.getDerrotas() + " derrotas e ");
        System.out.println(this.getEmpates() + " empates.");   
    }
     
    public void ganharLuta(){    
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
         this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
         this.setEmpates(this.getEmpates()+1);
    }   
    
}
