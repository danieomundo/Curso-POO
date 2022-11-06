package ProjetoPessoas;

public class Professor extends Pessoa { // Professor é especialização de Pessoa.
    
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String es) {
        this.especialidade = es;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float sal) {
        this.salario = sal;
    }
    
    public void obterAumento(float aum){
        this.salario += aum;
    }

  @Override
    public String toString() {
        return "Pessoa{" + "nome=" + this.getNome() + ", sexo=" + this.getSexo() + ", idade=" + this.getIdade() + 
                ", especialidade=" + this.especialidade + ", salario=" + this.salario + '}';
    }
       
}
