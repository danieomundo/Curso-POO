package ProjetoPessoas;

public class Aluno extends Pessoa { // Aluno é especialização de Pessoa e generalização de Bolsista e Técnico.
    
    private int mat;
    private float mensalidade;
    private String curso;

    public int getMat() {
        return this.mat;
    }

    public void setMat(int m) {
        this.mat = m;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String c) {
        this.curso = c;
    }

    public float getMensalidade() {
        return this.mensalidade;
    }

    public void setMensalidade(float me) {
        this.mensalidade = me;
    }
  
    public void pagarMensalidade(){}
    public final void ExemploDeMetodoFinal(){}
    public void cancelarMat(){}

    @Override
    public String toString() {
        return "Aluno{" + "matrícula=" + this.getMat() + ", mensalidade=" + this.getMensalidade() + ", curso=" + this.getCurso() + '}';
    }    
    
}
