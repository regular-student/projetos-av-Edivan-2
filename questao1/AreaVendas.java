package questao1;

import java.util.HashMap;
import java.util.Map;

public class AreaVendas implements ObservadorEstoque {
    // Guarda se o produto tava zerado antes
    private Map<String, Boolean> estavaZerado = new HashMap<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        boolean zerado = estavaZerado.getOrDefault(nomeProduto, false);

        // RQ 1.6 Vendas alerta quando volta a ter estoque depois de ter zerado
        if (zerado && novaQuantidade > 0) {
            System.out.println("Vendas: " + nomeProduto + " voltou ao estoque (" + novaQuantidade + " unidades) apos ter zerado!");
        }

        estavaZerado.put(nomeProduto, novaQuantidade == 0);
    }
}
