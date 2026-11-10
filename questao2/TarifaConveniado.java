package questao2;

public class TarifaConveniado implements CalculoTarifa {
    // RQ 2.4 Constantes nomeadas para valores e desconto
    public static final double VALOR_HORA = 10.0;
    public static final int MINUTOS_GRATIS = 30;
    public static final double DESCONTO = 0.20;

    @Override
    public double calcular(int minutos) {
        // RQ 2.4 Primeiros 30 minutos gratis
        if (minutos <= MINUTOS_GRATIS) {
            return 0.0;
        }
        // Depois cobra horas iniciadas com desconto percentual
        int minutosCobrados = minutos - MINUTOS_GRATIS;
        int horas = (int) Math.ceil((double) minutosCobrados / 60.0);
        return (horas * VALOR_HORA) * (1.0 - DESCONTO);
    }
}
