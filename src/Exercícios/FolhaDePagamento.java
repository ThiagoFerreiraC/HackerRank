package Exercícios;

public class FolhaDePagamento {

    private final Aliquota aliquota;

    public FolhaDePagamento(Aliquota aliquota) {
        this.aliquota = aliquota;
    }

    public double processarSalario(Funcionario funcionario) {
        double salario = funcionario.getSalario();

        Double limite = aliquota.getLimiteInferiorEDescontoMapa()
                .keySet()
                .stream()
                .filter(limiteInferior -> salario > limiteInferior)
                .max(Double::compareTo)
                .get();

        double impostoTotal = aliquota.getLimiteInferiorETaxaMapa().get(limite) * salario;
        double impostoComDesconto = impostoTotal - aliquota.getLimiteInferiorEDescontoMapa().get(limite);

        return salario - impostoComDesconto;
    }
}
