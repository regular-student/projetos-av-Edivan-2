package questao2;

public class TarifaMensalista implements CalculoTarifa {
    // RQ 2.4 Constante nomeada
    public static final double VALOR_MENSAL = 50.0;

    @Override
    public double calcular(int minutos) {
        // RQ 2.3 Valor fixo independente do tempo
        return VALOR_MENSAL;
    }
}
