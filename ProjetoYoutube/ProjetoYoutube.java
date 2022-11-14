package projetoyoutube;

public class ProjetoYoutube {
    public static void main(String[] args) {
      
        // Programa principal
        
        Video v[] = new Video[3];     // Vetor de objetos pra criar 3 videos
        
        v[0] = new Video ("[POO] Aula 10: Herança");
        v[1] = new Video ("[POO] Aula 11: Polimorfismo");
        v[2] = new Video ("[PYTHON] Aula 01: Introdução");
        
        Gafanhoto g[] = new Gafanhoto[2];
        
        g[0] = new Gafanhoto ("@tintin", "Martin Pimenta", 3, "M");
        g[1] = new Gafanhoto ("@noinha", "Noah Pimenta", 5, "F");
        
        /*System.out.println("- - - -  V I D E O S -  - - -");                
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("- - - G A F A N H O T O S - - -");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
        
        Visualizacao vi[] = new Visualizacao[3];
        
        vi[0] = new Visualizacao(g[0],v[1]); // Martin assistindo Aula 11 de POO
        vi[0].avaliar(); 
        System.out.println(vi[0].toString());
        
        vi[1] = new Visualizacao(g[0], v[2]); // Martin assistindo Aula 1 de PYTHON
        System.out.println(vi[1].toString());
        
        vi[2] = new Visualizacao(g[1],v[1]); // Noah assistindo Aula 11 de POO
        System.out.println(vi[2].toString());
        
    }    
}
