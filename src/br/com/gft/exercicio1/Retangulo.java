package br.com.gft.exercicio1;

public class Retangulo implements AreaCalculavel {

    private Double largura;
    private Double altura;

    public Retangulo(Double largura, Double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return largura * altura;
    }
}
