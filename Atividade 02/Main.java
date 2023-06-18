import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaDeProduto listaDeProdutos = new ListaDeProduto();

        // Adicionando alguns produtos à lista
        listaDeProdutos.addProduto(new Produto("Estojo", 10.99f, 2));
        listaDeProdutos.addProduto(new Produto("Caderno", 19.99f, 10));
        listaDeProdutos.addProduto(new Produto("Pasta", 7.99f, 1));

        // Exibindo a lista de produtos (antes de vender algum produto)
        listaDeProdutos.exibirListaDeProdutos();

        try {
            // Tentando vender um produto que não está na lista
            listaDeProdutos.venderProduto("Caneta", 1);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            // Tentando vender um produto com valor pago menor do que o preço
            listaDeProdutos.venderProduto("Estojo", 2);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Exibindo a lista de produtos após tentativas de venda
        listaDeProdutos.exibirListaDeProdutos();

        try {
            // Venda de um produto válido
            listaDeProdutos.venderProduto("Caderno", 0);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Exibindo a lista de produtos após a venda bem-sucedida
        listaDeProdutos.exibirListaDeProdutos();
    }
}
