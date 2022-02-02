package br.com.gft.exercicio3;

public class HospedagemVip extends Hospedagem{

    private double valorAdicional;

    public HospedagemVip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }


    @Override
    public double printValor(){
        return this.getValor() + valorAdicional;
    }

    @Override
    public String toString() {
        return "Hospedagem Vip - Valor: " + printValor();
    }
}
