package br.com.gft.exercicio3;

public class Programa {

    public static void main(String[] args) {

        Hospedagem hospedagem = new Hospedagem(200);
        HospedagemVip hospedagemVip = new HospedagemVip(hospedagem.getValor(), 200);

        System.out.println("As diferenças de preços são estas: ");
        System.out.println(hospedagem);
        System.out.println(hospedagemVip);


    }
}
