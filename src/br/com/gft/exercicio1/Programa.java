package br.com.gft.exercicio1;

public class Programa {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(2);
        Retangulo retangulo = new Retangulo(2, 3);
        Circulo circulo = new Circulo(4);

        double areaQuadrado = quadrado.calculaArea();
        double areaRetangulo = retangulo.calculaArea();
        double areaCirculo = circulo.calculaArea();

        System.out.println("A area do quadrado é: " + areaQuadrado);
        System.out.println("A area do retangulo é: " + areaRetangulo);
        System.out.println("A area do circulo é: " + areaCirculo);


    }
}
