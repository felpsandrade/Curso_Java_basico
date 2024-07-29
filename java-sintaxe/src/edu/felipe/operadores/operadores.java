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
    double resultado = (10 * 7) + (20/4);

    //Quando o operador '+' é utilizado em tipo texto, ele faz a concatenação, ou seja junta os texto
    public static void main(String[] args) {
        /*String nomeCompleto = "Linguagem " + "JAVA";
        System.out.println(nomeCompleto);*/

        /*int numero = 5;
        numero = -numero; //converter numero para negativo
            System.out.println(numero);

        numero = numero * -1; //converter numero em positivo
            System.out.println(numero);*/

        int numero = 5;

            System.out.println(numero --);
        System.out.println(numero);

    }


}
