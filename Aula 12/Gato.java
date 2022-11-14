package aula12e13;

public class Gato extends Mamifero {
    
    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
     
    @Override
    public void locomover(){
        System.out.println("Andando");
    }
      
    @Override
    public void alimentar(){
        System.out.println("Comendo sachê");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Miau");
    }       
    
}
