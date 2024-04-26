public class Suco extends Estoque {

    private String sabor;

    public Suco() {
    }

    public Suco(int codigoProduto, String nome, String sabor) {
        super(codigoProduto, nome);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return super.toString() + "Sabor: " + sabor;
    }
}