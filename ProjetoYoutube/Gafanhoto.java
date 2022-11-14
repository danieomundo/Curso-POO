package projetoyoutube;

public class Gafanhoto extends Pessoa {
    
    // atributos
    
    private String login;
    private int totAssistido;

    // construtor
    // observe que como a superclasse tem um construtor definido, é necessário chamá-lo:
    
    public Gafanhoto(String login, String nome, int idade, String sexo) {
        super(nome, idade, sexo); // chama o construtor da superclasse. super é de superclasse
        this.login = login;
        this.totAssistido = 0;
    }
     
    // getters e setters
    
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return this.totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
      
    // método
  
    public void viuMaisUm(){}
    
    // toString
  
    @Override
    public String toString() {
        return "Gafanhoto {" + super.toString() + ", login: " + login + ", totAssistido: " + totAssistido + '}';
    }  
 
    // o super.toString() vai chamar o toString de Pessoa. economiza tempo e o código fica mais clean :)
  
}
