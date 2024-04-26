public class Sistema {

    private static void exibirMenu() {
        System.out.println("\n SISTEMA DE ESTOQUE");
        System.out.println("1) Cadastrar Café");
        System.out.println("2) Cadastrar Suco");
        System.out.println("3) Cadastrar Comida");
        System.out.println("4) Listar Produtos");
        System.out.println("5) Excluir Produtos");
        System.out.println("6) Excluir todos Produtos");
        System.out.println("0) Sair");
        System.out.print("Informe um número das opção acima: ");
    }

    private static void verificarOpcao(int op) {

        int codigo;
        String nome;
        String nomeDoProduto;

        switch (op) {
            case 1:
                
                System.out.println("\nNovo Café:");
                System.out.print("Qual o codigo do produto: ");
                codigo = Console.lerInt();

                System.out.print("Qual o nome: ");
                nome = Console.lerString();

                System.out.print("Qual o nome do produto: ");
                nomeDoProduto = Console.lerString();

                Cafe c = new Cafe(codigo, nome, nomeDoProduto);

                CadastroEstoque.cadastrar(c);

                System.out.println("\nCafé cadastrado!");

                break;
            case 2:

                String origem;

                System.out.println("\nNovo Suco:");
                System.out.print("Código do produto: ");
                codigo = Console.lerInt();

                System.out.print("Nome da fruta: ");
                nome = Console.lerString();

                System.out.print("Qual a origem do produto:");
                origem = Console.lerString();

                Suco s = new Suco(codigo, nome, origem);

                CadastroEstoque.cadastrar(s);

                System.out.println("\nSuco cadastrado!");

                break;

            case 3:

                System.out.println("\nNova Comida:");
                System.out.print("Código do Produto: ");
                codigo = Console.lerInt();

                System.out.print("Nome da Comida: ");
                nome = Console.lerString();

                System.out.print("Nome do Produto:");
                origem = Console.lerString();

                Comidas cm = new Comidas(codigo, nome, origem);

                CadastroEstoque.cadastrar(cm);

                System.out.println("\nSuco cadastrado!");

                break;
           
                case 4:

                System.out.println("\nTodos os Produtos:");

                if (CadastroEstoque.getListaEstoques().size() == 0) {

                    System.out.println("\nNão há produto cadastrado");
                    return;
                    
                }

                for (Estoque temp : CadastroEstoque.getListaEstoques()) {

                    System.out.println(temp.toString());
                }

                break;

                case 5:
                System.out.println("\nQual o código do produto que deseja EXCLUIR do sistema ?");

                int codigoExcluir = Console.lerInt();
                
                Estoque estoqueExcluir = CadastroEstoque.buscar(codigoExcluir);

                if (estoqueExcluir != null) {
                    CadastroEstoque.excluirEstoque(estoqueExcluir);
                    System.out.println("Produto excluído com sucesso!");
                } else {
                    System.out.println("Produto não encontrado.");
                }

                break;

                case 6:

                CadastroEstoque.excluirTodosEstoques();

                System.out.println("\nTodos os produtos foram excluídos do estoque !!!");

                break;
            

                case 0:
                System.out.println("\nO programa foi finalizado...");
                break;
            default:
                System.out.println("\nNúmeracao invalida. Digite novamente.");
                break;
        }
    }

    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);
    }
}
