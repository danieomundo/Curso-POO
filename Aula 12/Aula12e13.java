package aula12e13;
public class Aula12e13 {
    public static void main(String[] args) { 
        
        /*Mamifero m  = new Mamifero();
        m.setIdade(5);
        m.emitirSom();
        m.alimentar();
        
        Gato gato = new Gato();
        gato.setCorPelo("Malhado");
        gato.setRaca("PCA");
        gato.alimentar();
        gato.emitirSom();
        
        Cobra cobra = new Cobra();
        cobra.alimentar();
        
        Canguru ca = new Canguru();
        ca.locomover();
        ca.usarBolsa();*/
        
        Cachorro dog = new Cachorro();
        dog.reagir("olá!"); // Abanar e Latir
        dog.reagir("toma comida"); // Abanar e Latir
        dog.reagir(true); // dono = true - Abanando o rabo e latindo Au! Au!
        dog.reagir("oi, doguinho! você morde?"); // Rosnar
        dog.reagir(10, 02); // 10:02h - Abanar
        dog.reagir(15, 15); // 15:15h - Abanar e Latir
        dog.reagir(4, 8.0f); // 4 anos e 8kgs - Abanar
        dog.reagir(8, 11.3f); // 8 anos e 11.3 kgs - Ignorar
        dog.reagir(false); // não é o dono - Rosnar e latir
    }   
}
