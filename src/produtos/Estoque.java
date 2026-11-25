package produtos;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) throws ProdutoJaExisteException {
        if (produto == null || produto.getNomeDoProduto() == null || produto.getPrecoDoProduto() == null) {
            throw new IllegalArgumentException("Erro: entrada vazia");
        }

        if (produto.getPrecoDoProduto() <= 0) {
            throw new IllegalArgumentException("Erro: preço negativo ou igual a 0");
        }

        for (Produto produtoExistente : produtos) {
            if (produtoExistente.getNomeDoProduto().equals(produto.getNomeDoProduto())) {
                throw new ProdutoJaExisteException("Erro: Produto já existente");
            }
        }

        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "produtos=" + produtos +
                '}';
    }
}
