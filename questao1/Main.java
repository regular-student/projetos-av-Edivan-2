package questao1;

public class Main {
    public static void main(String[] args) {
        // RQ 1.8 Demonstracao com as 3 areas, varias alteracoes e remocao
        Produto produto = new Produto("Teclado Mecanico", 15);

        ObservadorEstoque compras = new AreaCompras();
        ObservadorEstoque vendas = new AreaVendas();
        ObservadorEstoque auditoria = new AreaAuditoria();

        produto.adicionarObservador(compras);
        produto.adicionarObservador(vendas);
        produto.adicionarObservador(auditoria);

        System.out.println("Alterando para 8:");
        produto.setQuantidade(8);

        System.out.println("\nTentando alterar para 8 de novo (nao deve notificar):");
        produto.setQuantidade(8);

        System.out.println("\nAlterando para 3 (alerta compras):");
        produto.setQuantidade(3);

        System.out.println("\nZerando estoque:");
        produto.setQuantidade(0);

        System.out.println("\nVoltando estoque para 15 (alerta vendas):");
        produto.setQuantidade(15);

        System.out.println("\nRemovendo compras dos observadores:");
        produto.removerObservador(compras);

        System.out.println("\nAlterando para 2 (compras nao deve alertar):");
        produto.setQuantidade(2);
    }
}
