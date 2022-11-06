package ProjetoPessoas;

/*    Uma classe Abstrata só pode servir como progenitora (mãe), não pode ser 
instanciada. Partindo deste princípio, defini a classe Pessoa como abstract class. */

public abstract class Pessoa { 
  
    private String nome, sexo;
    private int idade;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public final void fazerAniversario(){
        this.idade++;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + this.getNome() + ", sexo=" + this.getSexo() + ", idade=" + this.getIdade() + '}';
    }
       
}



