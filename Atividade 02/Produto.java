public class Produto {
    private String nome;
    private float preco;
    private int quantidade;

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void adicionarUnidade(){
        this.quantidade++;
    }

    public void removerUnidade(){
        this.quantidade--;
    }

    public void adicionarUnidade(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerUnidade(int quantidade){
        this.quantidade -= quantidade;
    }
}

