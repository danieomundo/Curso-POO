package aula03;

public class Aula03 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; // não é possível modificar diretamente um atributo ou método privado.
        c1.carga = 80;
        //c1.tampada = true; // não é possível modificar diretamente um atributo ou método privado.
        c1.status(); 
       
        c1.tampar();
        c1.destampar();
        
        /*
        
        Observe que conseguimos tampar() ou destampar() porque, embora o atributo tampada esteja como 
        privado, eu estou acessando o método destampar(), e é ele quem está acessando o atributo. E, 
        inclusive, esse método está na mesma Classe do atributo. Logo, ele pode modificar o atributo. 
        
        Para ilustrar melhor esse conceito de modificador PRIVATE, imagine que você foi ao Supermercado 
        comprar um controle remoto que custa 40,00. Você chega no Caixa, dá uma nota de 50,00 e a pessoa 
        funcionária te dá o troco de 10,00. 
        
        Neste cenário, podemos notar que:
        
        - O acesso ao Caixa é privado, não é qualquer pessoa que pode mexer. VOCÊ não pode mexer. 
        Porém, o funcionário pode.
        - Entre você e o funcionário existe o acesso Público. Você dá o dinheiro para ele, e ele 
        quem vai fazer a intermediação entre você e o seu troco.
        
        E é dessa forma que o modificador PRIVATE funciona. Você não tem acesso direto ao atributo.
        
       */              
        
    }
}

    
    
