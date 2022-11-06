package aula07.UltraEmojiCombat;
import java.util.Random;

public class Luta {
    
    // atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }       
    }
    
    public void lutar(){
        
        Random random = new Random(); // gerar números aleatórios
        
        if (this.aprovada){
            
            System.out.println(" # # #  DESAFIADO  # # # ");
            this.desafiado.apresentar();
            System.out.println(" # # #  DESAFIANTE  # # # ");
            this.desafiante.apresentar();
            
            int vencedor = random.nextInt(3); // vai gerar número aleatório entre 0 e 2
            
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");
            System.out.println("                   RESULTADO                 ");
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");
            System.out.println();
            
            switch (vencedor){
            
                case 0:
                    System.out.println("EMPATE!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta(); 
                    break;
                  
                case 1:
                    System.out.println("Vitória do " + this.desafiado.getNome() + "!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();               
                    break;
                    
                case 2:    
                    System.out.println("Vitória do " + this.desafiante.getNome() + "!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            
            System.out.println();
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");
            System.out.println("            ATUALIZAÇÃO DO PLACAR            ");
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");
            System.out.println();
            this.desafiado.status();
            System.out.println();
            this.desafiante.status();     
            System.out.println();            
            
        } else {
            System.out.println("A luta não pode acontecer! Consulte as regras.");        
        }
    }
                   
    // métodos especiais
    
    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }
    
    public Lutador getDesafiado(){
        return this.desafiado;
    }

    public void setDesafiante(Lutador ds){
        this.desafiante = ds;
    }

    public Lutador getDesafiante(){
        return this.desafiante;
    }

    public void setRounds(int r){
        this.rounds = r;
    }
    
    public int getRounds(){
        return this.rounds;
    }
    
    public void setAprovada(boolean ap){
        this.aprovada = true;
    }
    
    public boolean getAprovada(){
        return this.aprovada;
    }
    
}
