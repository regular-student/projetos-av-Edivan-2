package questao2;

public class Tiquete {
    // RQ 2.1 Placa e tempo de permanencia em minutos
    private String placa;
    private int tempoMinutos;
    private CalculoTarifa tarifa;

    public Tiquete(String placa, int tempoMinutos, CalculoTarifa tarifa) {
        this.placa = placa;
        this.tempoMinutos = tempoMinutos;
        this.tarifa = tarifa;
    }

    public String getPlaca() {
        return placa;
    }

    public int getTempoMinutos() {
        return tempoMinutos;
    }

    public void setTempoMinutos(int tempoMinutos) {
        this.tempoMinutos = tempoMinutos;
    }

    // RQ 2.6 Permite trocar o perfil de cobranca em tempo de execucao
    public void setTarifa(CalculoTarifa tarifa) {
        this.tarifa = tarifa;
    }

    // RQ 2.7 Sem if/else ou switch, chama a estrategia diretamente
    public double calcularValor() {
        return tarifa.calcular(tempoMinutos);
    }
}
