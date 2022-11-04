package aula04;

public class Caneta {
      
        // atributos
    
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

        // construtor
    
    public Caneta(){
        this.modelo = "BIC";
        this.cor = "Azul"; 
    }
    
    public Caneta(String m, String c, float p){ 
        this.setModelo(m);                          
        this.setCor(c);
        this.setPonta(p);
        this.tampar();                                  
    }
      
        // métodos especiais
        
    public String getModelo(){
        return this.modelo; 
    }
    
    public void setModelo(String m){
       this.modelo = m; // "this.modelo" referencia o objeto. 
       // exemplo: caneta modelo Bic.
       // this.modelo = m; é o mesmo que: caneta.modelo = "Bic";
    }
     
    public String getCor(){
        return this.cor;  
    }
    
    public void setCor(String c) {
        this.cor = c;
    }

    /* 
    public void getPonta(){
        return this.ponta;
    }
    // por que está dando instrução de retorno desnecessária?
    // resposta: está dando esse problema porque o método está como public void, 
    e voids são funções sem retorno. sendo assim, precisamos alterar public void 
    getPonta() para public float getPonta(). 
    */
       
    public float getPonta(){
        return this.ponta;
        // getPonta tá pegando o novo valor definido no método Set.
    }
    
    public void setPonta(float p){ //parâmetro p vai receber valor definido lá no Main.
        this.ponta = p;
    }
    
      // métodos
    
    public void status(){
        System.out.println("SOBRE A CANETA: ");
        //System.out.println("Modelo: " +this.modelo);      // em vez de mexer num atributo diretamente,
        //System.out.println("Ponta: " +this.ponta);       // é uma prática melhor utilizar o método get.
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
    
    public void tampar(){
        this.tampada = true; 
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
}
