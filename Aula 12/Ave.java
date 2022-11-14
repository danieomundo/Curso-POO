package aula12e13;

public class Ave extends Animal {
    
    // atributo
    private String corPena;
 
    // método getter e setter
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
      
    @Override
    public void alimentar(){
        System.out.println("Comendo frutas");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de ave");
    }
    
}
