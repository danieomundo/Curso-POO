package aula10;

// brincando com códigos

public class Aula10 {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Pit Doga");
        p1.setIdade(12);
        p1.setSexo("F");      
        System.out.println(p1.info() + "\nAtualmente é aposentada e se tornou a doguinha vizinha fofoqueira da rua.");
        
        Aluno p2 = new Aluno();
        p2.setNome("Martin");
        p2.setIdade(3);
        p2.setSexo("M");
        p2.setMatricula(12345);
        p2.setCurso("Análise de Comida");
        
        System.out.println(p2.info() + "\nEstá matriculado no curso " + p2.getCurso() + ". \nCódigo da Matrícula: " + 
                    p2.getMatricula() + ". Situação da Matrícula: " + 
                                p2.getStatusMatricula());
        
        Aluno a = new Aluno();
        a.setNome("Noah");
        a.setIdade(5);
        a.setSexo("F");
        a.setMatricula(54321);
        a.setCurso("Qualidade e Teste de Cochilos");
        System.out.println(a.info() + "\nEstá matriculada no curso " + a.getCurso() + ". \nCódigo da Matrícula: " +
                a.getMatricula() + ". Situação da Matrícula: " + a.getStatusMatricula());
        
        Professor p3 = new Professor();
        p3.setNome("Dog Pingo");
        p3.setIdade(65);
        p3.setSexo("M");
        p3.setEspecialidade("Mestre em Desgustar Comida");
        p3.setSalario(200000);
        System.out.println(p3.info() + "\nSua especialidade é " + p3.getEspecialidade() + ". Trabalha tão bem que ganha " + p3.getSalario() + " dogcoins!");
    
        Funcionario p4 = new Funcionario();
        p4.setNome("Yuki");
        p4.setIdade(77);
        p4.setSexo("F");
        p4.setSetor("Estoque");
        p4.setTrabalhando(true);
        System.out.println(p4.info() + "\nTrabalha no Setor de " + p4.getSetor() + ", gerenciando vendas e reposições de Whiskas Sachês.");
        
        Funcionario p5 = new Funcionario();
        p5.setNome("Mia"); // saudade miazuda
        p5.setIdade(13);
        p5.setSexo("F");
        p5.setSetor("Psicologia");
        p5.setTrabalhando(true);
        System.out.println(p5.info() + "\nTrabalha no Setor " + p5.getSetor() + 
                ", cuja função é ser Suporte Emocional para o seu humano. \nTrabalhando atualmente? " 
                    + p5.getTrabalhando());
               
    }    
}
