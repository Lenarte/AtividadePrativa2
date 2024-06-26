public class Suco extends Estoque {

    private String origem;

    public Suco() {
    }

    public Suco(int codigoProduto, String nome, String origem) {
        super(codigoProduto, nome);
        this.origem = origem;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOrigem: " + origem;
    }
}
