package br.com.gft.exercicio2;

public class Programa {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Wilson", 55, 10000);
        Supervisor supervisor = new Supervisor("Claudia", 40, 5000);
        Vendedor vendedor = new Vendedor("Silvia", 30, 3000);

        System.out.println(gerente);
    }
}
