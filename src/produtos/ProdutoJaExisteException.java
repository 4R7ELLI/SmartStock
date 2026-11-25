package produtos;

public class ProdutoJaExisteException extends Exception {
    public ProdutoJaExisteException(String message) {
        super(message);
    }
}
