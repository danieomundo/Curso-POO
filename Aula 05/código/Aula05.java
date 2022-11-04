package aula05;

public class Aula05 {

    public static void main(String[] args) {
              
       ContaBanco cliente = new ContaBanco();
       cliente.setNumConta(43212);
       cliente.setNome("Martin Pimenta");
       cliente.abrirConta("CC");
       //cliente.sacar(50);
       cliente.pagarMensal();
       cliente.estadoAtual();
     
       ContaBanco cliente2 = new ContaBanco();
       cliente2.setNumConta(65482);
       cliente2.setNome("Noah Pimenta");
       cliente2.abrirConta("CP");
       cliente2.depositar(100);
       cliente2.pagarMensal();
       cliente2.estadoAtual();
 
    }
    
}
