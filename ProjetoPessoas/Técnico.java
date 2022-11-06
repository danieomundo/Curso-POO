package ProjetoPessoas;

public class Técnico extends Aluno { // Técnico é especialização de Aluno.
    
    private int registroProfissional;

    public int getRegistroProfissional() {
        return this.registroProfissional;
    }

    public void setRegistroProfissional(int regProf) {
        this.registroProfissional = regProf;
    }
     
    public void praticar(){}
   
}
