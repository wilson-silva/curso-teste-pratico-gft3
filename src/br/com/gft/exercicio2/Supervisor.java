package br.com.gft.exercicio2;

public class Supervisor extends Funcionario {

    public Supervisor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificacao(){
        return getSalario() + 5000.00;
    }


}
