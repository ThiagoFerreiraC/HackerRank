package Exercícios;

public class DepartamentoPessoal implements Funcionario{

    private final double salario = 2000;
    @Override
    public double getSalario() {
        return salario;
    }
}
