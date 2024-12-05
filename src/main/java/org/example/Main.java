package org.example;

public class Main {

    // instanciar classe
    // Variaveis variavel = new Variaveis();

    public static void main(String[] args) {
        System.out.println("Hello World");

        //Como criar uma variavel
        //1° Tipo: Integer, Double, Float, Boolean, String
        //2° Nome: qualquer nome que faça sentido.
        Integer resultadoSoma;
        // return 3+3;
        resultadoSoma = Variaveis.somaNumeros(21, 13);
        System.out.println(resultadoSoma);


        //Sistema
        String nome = "Gabriel Augusto";

        Double n1 = 6.0;
        Double n2 = 6.0;
        Double n3 = 6.0;
        Double n4 = 6.0;


        Double resultadoMedia;
        resultadoMedia = Variaveis.calculaMedia(n1, n2, n3, n4);

        System.out.println("Aluno: " + nome);
        System.out.println("Media: " + resultadoMedia);

        //Se for chover { levar guarda chuva} Se não { nao levar guarda chuva }
        if(resultadoMedia >= 6.0) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
        }

    }
}
