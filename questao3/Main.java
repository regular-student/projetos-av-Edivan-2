package questao3;

public class Main {
    public static void main(String[] args) {
        // criando os prototipos das bebidas base
        Bebida prototipoEspresso = new Espresso();
        Bebida prototipoCha = new Cha();

        // Complementos disponiveis
        Complemento leite = new Leite();
        Complemento chantilly = new Chantilly();
        Complemento calda = new Calda();

        // RQ 3.8 Montar ao menos 3 pedidos distintos clonando os prototipos

        // Pedido 1: clona o espresso e adiciona chantilly
        Bebida pedido1 = prototipoEspresso.clonar();
        pedido1.adicionarComplemento(chantilly);
        System.out.println("Pedido 1: " + pedido1.getDescricao() + " | Total: R$ " + pedido1.getPreco());

        // Pedido 2: clona o cha e adiciona leite duplo e calda 
        Bebida pedido2 = prototipoCha.clonar();
        pedido2.adicionarComplemento(leite);
        pedido2.adicionarComplemento(leite);
        pedido2.adicionarComplemento(calda);
        System.out.println("Pedido 2: " + pedido2.getDescricao() + " | Total: R$ " + pedido2.getPreco());

        // Pedido 3: clona espresso e monta completo
        Bebida pedido3 = prototipoEspresso.clonar();
        pedido3.adicionarComplemento(leite);
        pedido3.adicionarComplemento(chantilly);
        pedido3.adicionarComplemento(calda);
        System.out.println("Pedido 3: " + pedido3.getDescricao() + " | Total: R$ " + pedido3.getPreco());
    }
}
