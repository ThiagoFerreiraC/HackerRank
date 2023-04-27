package Exercícios;

import java.util.HashMap;
import java.util.Map;

public class Aliquota {

    private Map<Double, Double> limiteInferiorETaxaMapa = new HashMap<>();
    private Map<Double, Double> limiteInferiorEDescontoMapa = new HashMap<>();

    public void config() {
        gerarLimiteInferiorEDescontoMapa();
        gerarLimiteInferiorETaxaMapa();
    }

    private void gerarLimiteInferiorETaxaMapa() {
        limiteInferiorETaxaMapa.put(1903.99, 0.075);
        limiteInferiorETaxaMapa.put(2826.66, 0.15);
        limiteInferiorETaxaMapa.put(3751.06, 0.225);
        limiteInferiorETaxaMapa.put(4664.68, 0.275);
    }

    private void gerarLimiteInferiorEDescontoMapa() {
        limiteInferiorEDescontoMapa.put(1903.99, 142.80);
        limiteInferiorEDescontoMapa.put(2826.66, 354.80);
        limiteInferiorEDescontoMapa.put(3751.06, 636.13);
        limiteInferiorEDescontoMapa.put(4664.68, 869.30);
    }

    public Map<Double, Double> getLimiteInferiorEDescontoMapa() {
        return limiteInferiorEDescontoMapa;
    }

    public Map<Double, Double> getLimiteInferiorETaxaMapa() {
        return limiteInferiorETaxaMapa;
    }
}


