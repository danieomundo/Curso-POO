package aula05;

public class ContaBanco {
    
    // atributos
  
    public int numConta;
    protected String tipo;
    private String nome;
    private float saldo;
    private boolean status; 
    
    // construtor
    
    /* public ContaBanco (int n, String t, String n, float s, boolean st){
        this.setNumConta(n);
        this.setTipo(t);
        this.setNome(n);
        this.setSaldo(s);
        this.setStatus(st);
    } */
      
    public ContaBanco (){ 
        this.setSaldo(0);
        this.setStatus(false);  // definindo status como false. mesma coisa que this.status = false;
    }
       
    // métodos personalizados
    
    public void estadoAtual(){
        System.out.println("--------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("--------------------------------------");    
    }
        
    public void abrirConta(String t){      
        
        this.setTipo(t);
        this.setStatus(true); 

        if (this.getTipo() == "CC"){
            this.setSaldo(50);
        } else if (this.getTipo() == "CP") {
            this.setSaldo(150);
        } else {
            System.out.println("ERRO! Digite tipo de conta válida! [CC/CP]");
        }     
    }
    
    public void fecharConta(){
        if (this.saldo > 0){
            System.out.println("Impossível encerrar conta. Favor efetuar saque de todo o saldo e tentar novamente.");
        } else if (this.saldo < 0){
            System.out.println("Conta em débito, impossível encerrar.");
        } else {
            System.out.println("Conta encerrada.");
            this.setStatus(false);
        }
    }
    
    public void depositar(float v){        
        if (this.getStatus()){ // mesma coisa que if getStatus(true);
            this.setSaldo(getSaldo() + v); // saldo = saldo + v;
        } else {
            System.out.println("Impossível depositar. Conta está encerrada ou não existe.");
        }
        //System.out.println("Saldo atual:"+getSaldo());
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo()>=v) {
                this.setSaldo(getSaldo()-v); // saldo = saldo - v;
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Serviço indisponível. Conta está encerrada ou não existe.");
        }
    }
    
    public void pagarMensal(){
        
        float v = 0;
        
       if (this.getStatus()){ // se conta está aberta. mesma coisa que if getStatus(true); 
           
           // identificando tipo de conta
           if (this.getTipo().equals("CC")) { // usei o .equals() para treinar, ver se dava certo. e deu hehe
               v = 12; //se for conta corrente, a variável recebe 12. pois taxa de mensalidade CC é 12,00.
           } else if (this.getTipo().equals("CP")) {
               v = 20; // se for conta poupança, a variável v recebe 20. pois taxa de mensalidade CP é 20,00.
           }
         
            if (this.getSaldo()>v) {
               this.setSaldo(this.getSaldo()-v);
            } else {
                System.out.println("Impossível pagar. Saldo indisponível.");
            } 
            
        } else { // se getStatus(false);
           System.out.println("Impossível pagar. Conta encerrada ou inexistente.");
       }
    }
  
    // métodos getters e setters
    
    public void setNumConta(int n){
        numConta = n;
    }
    
    public int getNumConta(){
        return this.numConta;
    }
    
    public void setTipo(String t){
        tipo = t;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setNome(String n){
        nome = n;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSaldo(float s){
        saldo = s;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setStatus(boolean st){
        status = st;
    }
    public boolean getStatus(){
        return this.status;
    }
        
}
