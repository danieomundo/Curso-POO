package aula06;

public interface Controlador {
    
// métodos abstratos: métodos que não serão implementados na interface. 
// aqui contém apenas as assinaturas desses métodos.
// em outras palavras: numa interface eu não digo o que cada método vai 
// fazer, eu simplesmente digo que vou precisar desses métodos.
    
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void aumentarVolume();
    public abstract void diminuirVolume();
    public abstract void reproduzir();
    public abstract void pausar();
    public abstract void mute();
    public abstract void unmute();
    
}
