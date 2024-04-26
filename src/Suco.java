public class Suco extends Estoque {

    private String origem;

    public Suco() {
    }

    public Suco(int codigoProduto, String nome, String sabor) {
        super(codigoProduto, nome);
        this.origem = sabor;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String sabor) {
        this.origem = sabor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOrigem: " + origem;
    }
}