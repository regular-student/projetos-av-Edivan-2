package questao2;

public class TarifaRotativo implements CalculoTarifa {
    // RQ 2.4 Constante nomeada
    public static final double VALOR_HORA = 10.0;

    @Override
    public double calcular(int minutos) {
        if (minutos <= 0) {
            return 0.0;
        }
        // RQ 2.2 Cobranca por hora iniciada
        int horas = (int) Math.ceil((double) minutos / 60.0);
        return horas * VALOR_HORA;
    }
}
