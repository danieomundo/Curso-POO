package aula03;

public class Caneta {
      
    // atributos
    
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    // métodos
    
    void status(){ 
        System.out.println("Modelo da caneta: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Quantidade de carga: " + this.carga);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampada);     
    }
      
    public void escrever(){}
    
    public void pintar(){}
    
    private void rabiscar(){            
        if(tampada) {
            System.out.println("ERRO! Caneta está tampada.");
        } else {
            System.out.println("Rabisco");
            this.carga = carga - 10;
                if (carga == 0) {
                    System.out.println("Não é possível mais rabiscar, carga acabou!");
                }
        }  
    }
    
    public void tampar(){
        this.tampada = true; // this é referência ao próprio objeto que chamou ele, ou seja c1.
        System.out.println("Caneta tampada.");
    }
    
    public void destampar(){
        this.tampada = false;
        System.out.println("Caneta destampada.");
    }
    
    void sCarga(){       
        System.out.println("Carga atual: " + this.carga);
    }   

}
