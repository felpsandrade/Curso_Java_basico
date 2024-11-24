package edu.felipe.operadores;

public class operadores {
    /*SÃO SÍMBOLOS ESPECIAIS QUE TEM UM SIGNIFICADO PRÓPRIO PARA A LINGUAGEM E ESTÃO ASSOCIADOS A DETERMINADAS OPERAÇÕES*/

    //Atribuição: Representado pelo símbolo de igualdade '='

    String nome = "Felipe";
    int idade = 20;
    double peso = 57.5;
    char sexo = 'M';
    boolean doadorOrgao = false;
    //Date dataNascimento = new Date();

    //Aritméticos: + (adição), - (subtração), * (multiplicação) e / (divisão);

    double soma = 10.5 + 15.7;
    int subtracao = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20 / 4);

    //Quando o operador '+' é utilizado em tipo texto, ele faz a concatenação, ou seja junta os texto
    public static void main(String[] args) {
        /*String nomeCompleto = "Linguagem " + "JAVA";
        System.out.println(nomeCompleto);*/

    /*int numero = 5;
    numero = -numero; //converter numero para negativo
        System.out.println(numero);

    numero = numero * -1; //converter numero em positivo
        System.out.println(numero);*/





/*INCREMENTAÇÃO EM '1' E NEGAÇÃO DE BOOLEANO ----- AULA 04

        int numero = 5;
        boolean variavel = true;

        //x repeticao
        //numero = numero + 1;

        //Para abreviar, usamos operador de atribuição
        //numero++;

        System.out.println(numero);

        //Tambem é possivel incrementar diretamente no print
        System.out.println(++numero);

        //Mesma regra é incrementada para diminuir ou subtrair um numero
        System.out.println(--numero);

        //Usando operador de negação '!' para trocar resultado
        System.out.println(!variavel);
        System.out.println(variavel);
*/





 /*OPERADOR TERNÁRIO ----- AULA 05

        //Operador ?:
        int a, b;
        a = 5;
        b = 6;
        //String resultado ="";

        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if (a==b)
            resultado = "Verdadeiro";
        else
            resultado = "falso";

        //Utilizando o operador ternario

        String resultado = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);
*/




/*OPERADORES RELACIONAIS ----- AULA 06
        //'=' igual a
        //'!=' diferente
        //'>' maior que
        //'>=' maior ou igual
        //'<' menor que
        //'<=' menor ou igual

        String nomeUm = "Felipe";
        String nomeDois = "Paulo";
        String nomeTres = new String("Felipe");

        System.out.println(nomeUm == nomeDois);

        //'.equals' é utilizado para comparar informaçoes dentro de objetos, com ela conseguimos comparar se a
        //informação dentro do objeto é ingual ou diferente de uma variavel fora do objeto.
        System.out.println(nomeUm.equals(nomeTres));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição '<' é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
*/




//OPERADORES LOGICOS ----- AULA 07
        //'&&' OPERADOR 'e'
        //'||' OPERADOR 'ou'

        boolean condicao1=true;
        boolean condicao2=true;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        //tambem funciona com numeros
        if(condicao1 && ( 7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }else{
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("Fim!");

    }
}

