package questao1;

public class AreaCompras implements ObservadorEstoque {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        // RQ 1.6 Compras alerta se o estoque ficar abaixo de 5
        if (novaQuantidade < 5) {
            System.out.println("Compras: Alerta! Estoque de " + nomeProduto + " abaixo de 5 unidades (atual: " + novaQuantidade + ")");
        }
    }
}
