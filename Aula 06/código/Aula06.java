package aula06;

public class Aula06 {
    
    public static void main(String[] args) {
        
     ControleRemoto c = new ControleRemoto();
     
     c.ligar();
     c.abrirMenu();
     c.aumentarVolume();
     c.aumentarVolume(); 
     c.aumentarVolume();
     
    // verificando esse monte de aumentarVolume(), por que não colocamos logo c.aumentarVolume(20)?
    // RESPOSTA:
    // porque o encapsulamento é bem rígido e definimos os métodos especiais (get e set) de Volume 
    // como privados. logo, não tem como modificar diretamente. se estivesse definido como public, daria.
           
     c.abrirMenu();
     c.fecharMenu();
     c.mute();
     c.abrirMenu();
     c.reproduzir();
     c.abrirMenu();
     c.unmute();
     c.abrirMenu();     
     
    }
}
