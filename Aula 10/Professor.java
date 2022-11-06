package aula10;

public class Professor extends Pessoa {
    
    private String especialidade;
    private double salario;
    
    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String es) {
        this.especialidade = es;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double sal) {
        this.salario = sal;
    }
   
    public void receberAum(){}
    
}
