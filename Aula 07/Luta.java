package aula07.UltraEmojiCombat;
import java.util.*;

public class Luta {
    
    // atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    // métodos
  
    public void marcarLuta(Lutador l1, Lutador l2){
        if ((l1.getCategoria() == l2.getCategoria()) && l1!=l2){ // se forem da mesma categoria e l1 diferente de l2
            this.setAprovada(true); // vai aprovar e a luta pode acontecer
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            System.out.println("Impossível lutar. Consulte as regras."); // se nao satisfazer as regras de serem da mesma categoria e lutadores diferentes
            this.setAprovada(false); // nao vai aprovar e a luta nao vai poder acontecer
            this.desafiado = null;
            this.desafiante = null;
        }       
    }
    
    public void lutar(Lutador l1, Lutador l2){
        
        Random random = new Random(); // gerar números aleatórios
        
        if (this.getAprovada()){ 
  
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            
            int vencedor = random.nextInt(3); // vencedor recebe número aleatório entre 0 e 2
            
            switch (vencedor){  
            
                case 0:
                    System.out.println("EMPATE!!!");
                    l1.empatarLuta();
                    l2.empatarLuta(); 
                    break;
                  
                case 1:
                    System.out.println("Lutador " + l1.getNome() + " venceu!");
                    l1.ganharLuta();
                    l2.perderLuta();               
                    break;
                    
                case 2:    
                    System.out.println("Lutador " + l2.getNome() + " venceu!");
                    l2.ganharLuta();
                    l1.perderLuta();
                    break;
            }
            
            System.out.println();
            System.out.println("ATUALIZAÇÃO DEPOIS DA LUTA:");
            System.out.println();
            l1.status();
            l2.status();     
            
        } else {
            System.out.println("Impossível lutar!");        
        }
    }
                   
    // métodos especiais
    
    public void setDesafiado(Lutador dd){
        desafiado = dd;
    }
    
    public Lutador getDesafiado(){
        return desafiado;
    }

    public void setDesafiante(Lutador ds){
        desafiante = ds;
    }

    public Lutador getDesafiante(){
        return desafiante;
    }

    public void setRounds(int r){
        rounds = r;
    }
    
    public int getRounds(){
        return rounds;
    }
    
    public void setAprovada(boolean ap){
        aprovada = true;
    }
    
    public boolean getAprovada(){
        return aprovada;
    }
    
}
