public interface BankImpl {
    void createAccount(Client c);
    void depositar(Client c, double valor);
    void sacar(Client c, double valor);
    void transferir(Client c, Client c2, double valor);
}