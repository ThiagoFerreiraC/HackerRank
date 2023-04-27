package Exercícios;

public class Main {

    public static void main(String[] args) {
        Aliquota aliquota = new Aliquota();
        aliquota.config();
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento(aliquota);
        double salario = folhaDePagamento.processarSalario(new AnalistaDeSistema());
        System.out.println(salario);
    }
}
