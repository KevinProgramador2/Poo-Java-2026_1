public class ErroNoMetodoPagamentoException extends UnsupportedOperationException {

    public ErroNoMetodoPagamentoException() {
    }

    public ErroNoMetodoPagamentoException(String message) {
        super(message);
    }

    public ErroNoMetodoPagamentoException(Throwable cause) {
        super(cause);
    }

    public ErroNoMetodoPagamentoException(String message, Throwable cause) {
        super(message, cause);
    }

}
