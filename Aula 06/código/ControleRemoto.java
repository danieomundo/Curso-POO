package aula06;

public class ControleRemoto implements Controlador {
    
    // atributos 
  
    private int volume;   
    private boolean ligado;
    private boolean tocando;
      
    // método construtor
    
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = true;
        this.tocando = true;    
    }
    
    // métodos especiais
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private void setLigado(boolean l){
        this.ligado = l;
    }
    
    private int getVolume(){
        return this.volume;
    }
    
    private void setVolume(int v){
       this.volume = v; 
    }
    
    private boolean getTocando(){
        return this.tocando;
    }
    
    private void setTocando(boolean t){
        this.tocando = t;
    }
 
    // sobrescrevendo Métodos Abstratos
    
    @Override   
    public void ligar(){ 
        this.setLigado(true);
    }
    
    @Override
    public void desligar(){ 
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu(){
        System.out.println("- - - - - MENU - - - - -");
        System.out.println("Ligado? "+this.getLigado());
        System.out.println("Reproduzindo algo? "+this.getTocando());
        System.out.print("Volume: "+this.getVolume());      
        for (int i=10; i<=this.getVolume(); i+=10){ // começando do 10, enquanto ele for menor ou igual a volume e pulando de 10 em 10
            System.out.print(" |"); // uma barrinha pra cada 10 volumes      
        }
        System.out.println();
    }
    
    @Override
    public void fecharMenu(){
        System.out.println("Menu fechado.");
    }
    
    @Override
    public void aumentarVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume()+5);
        } else {
            System.out.println("Impossível aumentar volume.");
        }
    }
    
    @Override
    public void diminuirVolume(){
        if (this.getLigado()){
            this.setVolume(this.getVolume()-5);
        } else {
            System.out.println("Impossível diminuir volume.");
        }   
    }
    
    @Override
    public void mute(){
        if (this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }   
    }
    
    @Override 
    public void unmute(){
        if (this.getLigado() && this.getVolume()== 0){
            this.setVolume(50);
        }   
    }
    
    @Override
    public void reproduzir(){
        if (this.getLigado() && !(this.getTocando())){ // se está ligado e não está tocando
            this.setTocando(true);
        } else {
            System.out.println("Impossível reproduzir.");
        }
    }
    
    @Override
    public void pausar(){
        if (this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Impossível pausar.");
        }
    }
       
}
