package org.example;

public class Variaveis {

    //Como criar um método?
    //1° Restrição: public, private, protected
    //2° static: Acessar o método sem instanciar.
    //3° Retorno: void, Integer, Double, Float, Boolean
    //4° Nome: defino o nome do método
    //5° (): Parametros
    //6° { }: Determina onde o método inicia e onde ele termina.


    public static Integer somaNumeros(Integer x, Integer y) {
        return x + y;
    }

    public static Double calculaMedia(Double n1, Double n2, Double n3, Double n4) {
        return  (n1 + n2 + n3 + n4) / 4.0;
    }

}
