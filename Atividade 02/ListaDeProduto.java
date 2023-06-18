import java.util.ArrayList;
import java.util.List;

public class ListaDeProduto {
    private List<Produto> listaDeProdutos;

    public ListaDeProduto() {
        listaDeProdutos = new ArrayList<>();
    }

    public void addProduto(Produto produto) {
        listaDeProdutos.add(produto);
    }

    public void venderProduto(String nome, int quantidade) throws Exception {
        if(quantidade <= 0){
            throw new Exception("Quantidade não pode ser zero e nem menor que zero.");
        }
        Produto produto = null;
        for (Produto p : listaDeProdutos) {
            if (p.getNome().equals(nome)) {
                produto = p;
                break;
            }
        }

        if (produto == null) {
            throw new Exception("Produto não encontrado na lista.");
        }

        if(produto.getQuantidade() >= quantidade){
            if(produto.getQuantidade() >= 1){
                if(quantidade > 1){
                    produto.removerUnidade(quantidade);
                    System.out.println(quantidade + " unidades do produto " + produto.getNome() + " foram vendidas com sucesso!");
                } else if(quantidade == 1){
                    System.out.println(quantidade + " unidade do produto " + produto.getNome() + " foi vendida com sucesso!");
                    produto.removerUnidade();
                }
            }

            if(produto.getQuantidade() == 0){
                listaDeProdutos.remove(produto);
                System.out.println("Todas as unidades do produto " + produto.getNome() + " foram vendidas com sucesso!");
                System.out.println("Produto esgotado!");
            } else{
                System.out.println("Sobraram " + produto.getQuantidade() + " unidade(s) desse produto!");
            }
        } else {
            System.out.println("Não temos a quantidade solicitada! Temos apenas " + produto.getQuantidade() + " unidades");
        }
        
    }

    public void exibirListaDeProdutos() {
        if (listaDeProdutos.isEmpty()) {
            System.out.println("A lista de produtos está vazia.");
        } else {
            System.out.println("Lista de produtos:");
            System.out.println("|   Nome   | Preço | Quantidade |");
            for (Produto produto : listaDeProdutos) {
                System.out.println("| " + produto.getNome() + " | " + produto.getPreco() + " |    " + produto.getQuantidade() + "    |");
            }
        }
    }
}
