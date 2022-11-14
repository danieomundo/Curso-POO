package aula12e13;

public class Cachorro extends Lobo {
  
    // métodos sobrepostos
    
     @Override
    public void locomover(){
        System.out.println("Correndo");
    }
      
    @Override
    public void alimentar(){
        System.out.println("Comendo ração");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Au! Au!");
    }
      
    // métodos
    
    public void enterrarOsso(){
        System.out.println("Enterrando osso");
    }
    
    public void abanarRabo(){
        System.out.println("Doguíneo está abanando o rabíneo");
    }

    // polimorfismo de sobrecarga 
  
    /*   
    observamos abaixo que temos vários métodos com o mesmo nome - reagir()
    e na mesma classe, porém com argumentos (parâmetros) diferentes - assinaturas.    
    */
    
    public void reagir(String frase){
        if (frase.equals("toma comida") || frase.equals("olá!")) {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora, int min) {
        if (hora<12){
            System.out.println("Abanar");
        } else if (hora>=18){
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e Latir");
        }
    }
    
    /* public void reagir (int x, int y) {}
    esse método não funciona pois ele possui a mesma assinatura do método acima, 
    por mais que as variáveis tenham nomes diferentes... pois ainda assim o método 
    recebe 2 valores e do mesmo tipo. sobrecarga só é possível com parâmetros
    diferentes. se tiver mesma assinatura vai dar erro e não tem como criar o
    método.
    */
    
    public void reagir (boolean dono){
        if (dono){ // mesma coisa que if (dono == true)
            System.out.println("Abanando o rabo e latindo");
            this.emitirSom();
        } else {
            System.out.println("Rosnar e latir");
        }    
    }
    
    public void reagir (int idade, float peso){
        if (idade < 5) {
            if (peso<10){
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }      
        } else {
            if (peso<10){
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }       
    } 
     
}
