package ProjetoPessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
     
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p2.setNome("Ana");
        p3.setNome("João");
        p4.setNome("José");
        p3.setSexo("M");
        p3.setIdade(30);
        p3.fazerAniversario();
        p3.setEspecialidade("Banco de Dados");
        p3.setSalario(3000.50f);   
        p3.obterAumento(999.50f);
        
        Bolsista b = new Bolsista();
        Técnico t = new Técnico();
          
        b.setNome("Chris");
        b.setIdade(35);
        b.setMat(13564);
        b.setCurso("Sistemas de Informação");
        b.setMensalidade(500f);
        b.setBolsa(50);       
        
        
        t.setNome("Guy");
             
        b.ExemploDeMetodoFinal();
        t.ExemploDeMetodoFinal();
        
        /* 
        
        Podemos notar que as subclasses de Aluno - Bolsista e Técnico - conseguem chamar o ExemploDeMetodoFinal 
        normalmente, provando que elas HERDARAM o Método Final da superclasse Aluno. Ou seja, Método Final pode 
        ser herdado pelas subclasses, só não pode ser sobrescrito (@Override).  
        
        */
        
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());    
        System.out.println(b.toString());
        
        //b.renovarBolsa();       
        
    }
}
