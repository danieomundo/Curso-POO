<h1> Aula 4: Métodos Especiais </h1>

<h2>Método Getter: Método ACESSOR</h2>

Método Getter é aquele que pega alguma informação. Métodos Getters conseguem acessar um 
determinado atributo mantendo a segurança de acesso. Esse método não dá acesso direto 
ao objeto.

<b>Exemplo:</b>

    Obter saldo da conta: getSaldo();
_________________________________________________________________________
<h2>Método Setter: Método MODIFICADOR</h2>

Métodos Setters modificam coisas que estão dentro do objeto, garantindo também uma total 
segurança do atributo. 

Sendo assim, vamos a um exemplo: Imagine que tenha uma estante no Banco e você tenha 5 
documentos guardados nessa estante. E você deseja colocar mais 1 documento.

Com o método Set não deixamos a pessoa mexer diretamente num atributo. Só quem tem acesso 
a essa estante é um funcionário, e é ele que vai fazer essa intermediação. O documento vai 
passar para ele, que vai até a estante, analisa e verifica qual a pasta que pertence a você 
e, enfim, vai colocar o documento lá.

<b>EM VEZ DE:</b>

    e = nova Estante
    e.totDoc = e.totDoc+1

 <b>TEREMOS:</b>

    e = nova Estante
    e.setTotDoc(doc) // estou passando um documento como parâmetro

<h3>Conclusão: </h3>
        
- Os métodos Getters e Setters vão "proteger" o acesso direto ao atributo Privado.
- O atributo não vai estar disponível livremente para você, mas você pode acessá-lo 
através desses métodos Get e Set, e estes farão a intermediação. 
- É preciso fazer um Get e Set para cada atributo.      
_________________________________________________________________________        
<h2>Método Construtor </h2>

É um "método especial" que é chamado ao criar um objeto. Quando o objeto vai ser 
instanciado, o construtor vai "configurar" o objeto. Usamos o Construtor para nos
certificar de que um objeto (qualquer variável ou atributo, por exemplo) vai ser 
definido com o valor desejado.

- Usa-se a palavra reservada THIS.
- Recebe o mesmo nome da Classe que pertence.
- O código do construtor será executado antes de qualquer outro, já que o objeto só 
- pode ser usado depois de ser criado (instanciado).
- Construtores não podem retornar nenhum valor.
- Quando usamos a palavra _new_, estamos passando como um parâmetro qual Construtor 
deve ser executado para instanciar um objeto.
- Podemos ter vários construtores, desde que os parâmetros sejam diferentes.

<b>Exemplo: </b>

     Caneta bic = new Caneta();
 
 No código acima podemos observar que o Construtor a ser executado é Caneta(), cujo 
 código encontra-se definido na Classe Caneta.java.
    

    ATENÇÃO:
    
    O Construtor NÃO é um Método, ele só é usado quando criamos um objeto. 
    Ele apenas lembra um Método porque recebe parâmetros.



