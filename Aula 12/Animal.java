package aula12e13;
public abstract class Animal {    // classe abstrata não pode gerar objetos.
    
    // atributos     

    private float peso;
    private int idade;
    private int membros;

    // métodos getters e setters

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return this.membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    } 
    
    // métodos abstratos  

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    // lembrando que método abstrato não possui implementação na superclasse. 
    // as especializações vão herdar esses métodos e fazer suas próprias alterações.

}
