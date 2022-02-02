package br.com.gft.exercicio3;

public class Hospedagem {

    private double valor;

    public Hospedagem(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double printValor(){
       return this.valor;
    }

    @Override
    public String toString() {
        return "Hospedagem - Valor: " + printValor();
    }
}
