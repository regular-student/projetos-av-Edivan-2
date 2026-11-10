package questao1;

public class AreaAuditoria implements ObservadorEstoque {
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        // RQ 1.6 Auditoria registra qualquer alteracao no estoque
        System.out.println("Auditoria: " + nomeProduto + " teve o estoque alterado para " + novaQuantidade);
    }
}
