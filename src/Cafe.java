public class Cafe extends Estoque {

    private String nomeDoProduto;
    

    public Cafe () {

    }
    
    public Cafe(int codigoProduto, String nomeF, String nomeDoProduto) {

        super(codigoProduto, nomeF);
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
