import java.util.ArrayList;
import java.util.List;

public class CadastroEstoque {

    private static List<Estoque> listaEstoques = new ArrayList<>();

    public static void cadastrar(Estoque estoque) {

        listaEstoques.add(estoque);

    }

    public static List<Estoque> getListaEstoques () {

        return listaEstoques;

    }

    public static Estoque buscar(int codigoProduto) {

        for (Estoque temp: listaEstoques) {

            if (temp.getCodigoProduto() == codigoProduto) {

                return temp;
                
            }
        }

        return null;
    }

    public static void excluirEstoque(Estoque estoqueExcluir) {
        listaEstoques.remove(estoqueExcluir);
    }

    public static void excluirTodosEstoques() {
        listaEstoques.clear();
    }
    

    
}
