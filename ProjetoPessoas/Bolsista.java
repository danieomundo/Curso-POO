package ProjetoPessoas;

public class Bolsista extends Aluno { // Bolsista é especialização de Aluno.
    
    private int bolsa;
    private float novaMensalidade;

    public int getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    public float getNovaMensalidade(){
        return ((this.getMensalidade()*this.bolsa)/100);
    }
    
    public void setNovaMensalidade(float nm){
        this.novaMensalidade = nm;
    }
    
    public void renovarBolsa(){
    }
    
    /*@Override
    public final void ExemploDeMetodoFinal(){} // coloquei como exemplo para ver o que acontece 
    // Não consegue sobrescrever porque o método é FINAL (pode ser herdado mas não pode ser sobrescrito)
    */
    
    @Override 
    public void pagarMensalidade(){
        System.out.println("Valor integral da mensalidade: " + this.getMensalidade());
        System.out.println("Percentual de desconto concedido: " + this.getBolsa() + "%");    
    }

    @Override
    public String toString() {
        return "Aluno {nome: " + this.getNome() + ", matrícula:" + this.getMat() + ", mensalidade aluno integral: " + 
                this.getMensalidade() + ", curso: " + this.getCurso() + ", desconto em bolsa: " + this.getBolsa() + 
                    "%, mensalidade aluno bolsista: " + this.getNovaMensalidade() + '}';
    }
    
}
