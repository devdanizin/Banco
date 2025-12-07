public class Client {

    private String nome;
    private int accountId;
    private double saldo;

    public Client(String nome, int accountId, double saldo) {
        this.nome = nome;
        this.accountId = accountId;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Cliente: " +
                "nome='" + nome + '\'' +
                ", accountId=" + accountId +
                ", saldo=" + getSaldo() +
                '}';
    }
}