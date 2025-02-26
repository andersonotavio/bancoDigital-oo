public interface Iconta {

    void withdraw ( double value);
    void deposit( double value);
    void transfer( double value, Conta contaDestino);
    void imprimirExtrato();
}
