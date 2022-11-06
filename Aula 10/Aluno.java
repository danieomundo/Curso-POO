package aula10;

public class Aluno extends Pessoa { // classe filha herdando características e comportamentos da classe mãe
    
    // atributos
    
    private int matricula;
    private boolean statusMatricula;
    private String curso;
     
    // métodos especiais 
    
    public Aluno(){
        this.statusMatricula = true;      
    }
      
    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int m) {
        this.matricula = m;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String c) {
        this.curso = c;
    }
     
    public boolean getStatusMatricula() {       
        return this.statusMatricula;               
    }

    public void setStatusMatricula(boolean st) {
        this.statusMatricula = st;
    }
    
    // método 
    public void cancelarMatricula(){
        this.statusMatricula = false;      
    }
        
    @Override // sobrescrevendo pra testar se essa joça funciona também
    public String info(){
        return this.getNome() + " tem " + this.getIdade() + " anos. Gênero: " + this.getSexo() + ".";  // funcionou hehe
    } 
     
}
