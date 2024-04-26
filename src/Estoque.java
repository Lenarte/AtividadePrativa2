public class Estoque {

    private int codigoProduto;
    private String nome;

    public Estoque() {
    }

    public Estoque(int codigoProduto, String nome) {

        this.codigoProduto = codigoProduto;
        this.nome = nome;

    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nCodigo do Produto: " + codigoProduto + "\nNome do Alimento: " + nome;
    }
    
}
