package br.com.gft.exercicio2;

public class Vendedor extends  Funcionario{

    public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificacao(){
        return getSalario() + 3000.00;
    }
}
