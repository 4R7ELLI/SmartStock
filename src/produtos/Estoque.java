package produtos;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();
// lista para adicionar os produtos

    public void adicionarProduto(Produto produto) throws ProdutoJaExisteException {
        if (produto == null || produto.getNomeDoProduto() == null || produto.getPrecoDoProduto() ==  null ) {
            throw new IllegalArgumentException("Erro: entrada vazia");
        }
        if(produto.getPrecoDoProduto() <= 0){
            throw  new IllegalArgumentException("Erro: preço negativo ou igual a 0");
        }
       for(Produto a: this.produtos){

           if(a.getNomeDoProduto().equals(produto.getNomeDoProduto())){
            throw new ProdutoJaExisteException("Erro: Produto já Existente");
           }

       }
        produtos.add(produto);
    }
// metodo para adicionar produtos à lista


    @Override
    public String toString() {
        return "Estoque{" +
                "produtos=" + produtos +
                '}';
    }
}
