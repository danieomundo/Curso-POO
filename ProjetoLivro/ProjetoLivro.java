package ProjetoLivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2]; // vetor de duas posições
        Livro[] l = new Livro[3]; // vetor de 3 posições
        
        p[0] = new Pessoa("Noah", 5, "F");
        p[1] = new Pessoa("Martin", 3, "M");
        
        l[0] = new Livro("Eduque Seu Humano", "Meowth", 100, p[0]);
        l[1] = new Livro("Como Ganhar Mais Carinhos Do Seu Humano", "Meowth", 350, p[1]);
        l[2] = new Livro("Revolução Dos Gatos", "Yuki", 400, p[0]);
        
        System.out.println(l[0].detalhes());
        //System.out.println(l[1].detalhes());
        //System.out.println(l[2].detalhes());
        
        l[0].abrir();
        l[0].folhear(60);
        
        //System.out.println(l[0].detalhes());
        
        l[0].avançarPag();
        System.out.println(l[0].detalhes());
        
    }    
}
