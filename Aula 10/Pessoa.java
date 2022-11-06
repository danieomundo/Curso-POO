package aula10;

public class Pessoa {

    // atributos
    private String nome;
    private int idade;
    private String sexo;
        
    // métodos especiais
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setSexo(String s){
        this.sexo = s;
    }
    
    public String getSexo(){
        return this.sexo;
    }
       
   // método
    
    public String info(){
        return this.getNome() + " tem " + this.getIdade() + " anos.";
    }
     
    public void fazerAniv(){}
   
}
