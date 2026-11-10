package questao3;

import java.util.ArrayList;
import java.util.List;

// RQ 3.1 Toda bebida e todo pedido fornecem descricao e preco
public abstract class Bebida implements Cloneable {
    protected String descricao;
    protected double precoBase;
    protected List<Complemento> complementos = new ArrayList<>();

    public Bebida(String descricao, double precoBase) {
        this.descricao = descricao;
        this.precoBase = precoBase;
    }

    // RQ 3.4 e RQ 3.5 Adiciona complemento e permite o mesmo repetido
    public void adicionarComplemento(Complemento complemento) {
        complementos.add(complemento);
    }

    // RQ 3.4 Incorpora o nome do complemento na descricao
    public String getDescricao() {
        if (complementos.isEmpty()) {
            return descricao;
        }
        StringBuilder sb = new StringBuilder(descricao);
        for (Complemento c : complementos) {
            sb.append(", ").append(c.getNome());
        }
        return sb.toString();
    }

    // RQ 3.4 Acresce o valor do complemento no preco total
    public double getPreco() {
        double total = precoBase;
        for (Complemento c : complementos) {
            total += c.getPreco();
        }
        return total;
    }

    // padrao prototype para clonar o objeto e seus complementos
    @Override
    public Bebida clone() {
        try {
            Bebida copia = (Bebida) super.clone();
            copia.complementos = new ArrayList<>();
            for (Complemento c : this.complementos) {
                copia.complementos.add(c.clone());
            }
            return copia;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar a bebida", e);
        }
    }

    public Bebida clonar() {
        return this.clone();
    }
}
