package aula04;

public class Aula04 {
    
    public static void main(String[] args) {
        
        Caneta caneta = new Caneta("Faber Castell", "Vermelha", 0.7f);
        
        //caneta.status();
        
        Caneta c2 = new Caneta();
        c2.status();
        
        System.out.println("Tenho uma caneta " +caneta.getModelo()+ " de cor " + caneta.getCor() + " e de ponta "+caneta.getPonta()+".");
        // no trecho acima podemos perceber que não tivemos acesso direto aos atributos privados, 
        // utilizamos os métodos especiais para fazer a intermediação.
        
    }    
}
