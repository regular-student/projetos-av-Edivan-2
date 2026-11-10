package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	// RQ1.1 nome e quantidade no estoque
    private String nome;
    private int quantidade;
    // RQ 1.7 Lista de observadores desacoplada pra nao mexer na classe Produto quando criar nova area
    private List<ObservadorEstoque> observadores = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // RQ 1.5 Permite adicionar areas em tempo de execucao
    public void adicionarObservador(ObservadorEstoque obs) {
        observadores.add(obs);
    }

    // RQ 1.5 Permite remover areas pra nao receberem mais notificacao
    public void removerObservador(ObservadorEstoque obs) {
        observadores.remove(obs);
    }
    
    // RQ 1.2 Torna possível mudar a quantidade em estoque do produto
    // RQ 1.4 Checa se a quantidade realmente mudou
    public void setQuantidade(int novaQuantidade) {
        if (this.quantidade == novaQuantidade) {
            return;
        }
        this.quantidade = novaQuantidade;
        notificar();
    }

    // RQ 1.3 Notifica automaticamente as areas passando nome e nova quantidade
    private void notificar() {
        for (ObservadorEstoque obs : observadores) {
            obs.atualizar(nome, quantidade);
        }
    }
}
