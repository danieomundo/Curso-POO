package projetoyoutube;

public class Video implements AcoesVideo {    // vai implementar os métodos da interface AcoesVideo
        
      // atributos devidamente encapsulados
    
      private String titulo;
      private int avaliacao;
      private int views;
      private int curtidas;
      private boolean reproduzindo;

      // construtor para cadastrar video novo
      
      public Video(String titulo) {   
          this.titulo = titulo;       // define como titulo o que for passado por parâmetro
          this.avaliacao = 0;         // avaliaçao começa com 0
          this.views = 0;             // views começa zerado
          this.curtidas = 0;          // curtidas começa zerada
          this.reproduzindo = false;  
      }

    // métodos getters e setters 
    
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.avaliacao + avaliacao)/this.views);  // calculando media de acordo com a quantidade de visualizações de um video
        this.avaliacao = nova;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
          
    // sobrescrevendo os métodos abstratos da interface
    // retiramos o abstract e inserimos as chaves.
    
    @Override
    public void play(){
        this.reproduzindo = true;
    } 
    
    @Override
    public void pause(){
        this.reproduzindo = false;
    } 
    
    @Override
    public void like(){
        this.curtidas++;
    }

    // toString()
    
    @Override
    public String toString() {
        return "titulo: " + titulo + ", avaliacao: " + avaliacao + ", views: " + views + ", curtidas: " + curtidas + ", reproduzindo: " + reproduzindo;
    }
          
}
