public class Main {
    public static void main(String[] args) {
        CalculaMilhas calculaMilhas = new CalculaMilhas();
        MilhasParaQuilometrosAdapter adapter = new MilhasParaQuilometrosAdapter(calculaMilhas);

        int distanciaMilhas = 50;
        double distanciaQilometros = adapter.converterMilhasParaQuilometros(distanciaMilhas);

        System.out.printf("%d milhas equivalem a %.2f quilômetros.", distanciaMilhas, distanciaQilometros);
    }
}

class CalculaMilhas {
    public double calcularDistanciaMilhas(int startPoint, int endPoint) {
        return startPoint - endPoint;
    }
}

class ConversorQuilometros {
    public double converterMilhasParaQuilometros(double milhas) {
        return milhas * 1.60934;
    }
}

class MilhasParaQuilometrosAdapter extends ConversorQuilometros {
    private final CalculaMilhas calculaMilhas;

    public MilhasParaQuilometrosAdapter(CalculaMilhas milesCalculator) {
        this.calculaMilhas = milesCalculator;
    }

    public double converterMilhasParaQuilometros(double milhas) {
        int pontoInicio = 0;
        int pontoFim = (int) milhas;
        double distanciaMilhas = this.calculaMilhas.calcularDistanciaMilhas(pontoInicio, pontoFim);
        return super.converterMilhasParaQuilometros(distanciaMilhas);
    }
}
