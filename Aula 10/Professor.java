package aula10;

public class Funcionario extends Pessoa {
    
    private String setor;
    private boolean trabalhando;
        
    public void setSetor(String set){
        this.setor = set;
    }
    
    public String getSetor(){
        return this.setor;
    }
    
    public void setTrabalhando(boolean tr){
        this.trabalhando = tr;
    }
    
    public boolean getTrabalhando(){
        return this.trabalhando;
    }
    
    public void mudarTrabalho(){}
    
}
