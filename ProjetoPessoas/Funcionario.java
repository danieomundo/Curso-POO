package ProjetoPessoas;

public class Funcionario extends Pessoa { // Funcionario é especialização de Pessoa.
    
    private String setor;
    private boolean trabalhando;

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String se) {
        this.setor = se;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean tr) {
        this.trabalhando = tr;
    }
    
    public void mudaTrabalho(){
        this.trabalhando = ! this.trabalhando; // trabalhando vai receber o inverso
    }
    
}
