public class Comidas extends Estoque {
    
    private String nomeDoProduto;

    public Comidas() {
    }

    public Comidas(int codigoProduto, String nome, String nomeDoProduto) {
        super(codigoProduto, nome);
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNome do Produto: " + nomeDoProduto;
    }
}