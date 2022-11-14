package aula12e13;

public class Canguru extends Mamifero {
    
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
     
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }
   
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
       
}
