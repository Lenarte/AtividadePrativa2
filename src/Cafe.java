public class Cafe extends Estoque {

    private String nomeDoProduto;

    public Cafe () {

    }
    
    public Cafe(int codigoProduto, String nome, String nomeDoProduto) {

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
        
        return super.toString() + "Nome do Produto: " + nomeDoProduto;
    }


}
