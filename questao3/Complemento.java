package questao3;

// Classe base dos complementos
public class Complemento implements Cloneable {
    private String nome;
    private double preco;

    public Complemento(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public Complemento clone() {
        try {
            return (Complemento) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Complemento(this.nome, this.preco);
        }
    }
}
