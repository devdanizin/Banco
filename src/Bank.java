import java.util.Random;

public class Bank implements BankImpl{


    @Override
    public void createAccount(Client c) {
        c.setAccountId(generateId());
    }

    @Override
    public void depositar(Client c, double valor) {
        if(valor <= 0) System.out.println("Você não pode depositar valores menores que zero!");

        c.setSaldo(c.getSaldo() + valor);
    }

    @Override
    public void sacar(Client c, double valor) {
        if(valor <= 0) System.out.println("Você não pode sacar valores menores que zero!");
        if(c.getSaldo() < valor) System.out.println("Saldo insuficiente.");

        c.setSaldo(c.getSaldo() - valor);
    }

    @Override
    public void transferir(Client c, Client c2, double valor) {
        if(valor <= 0) System.out.println("Você não pode transferir valores menores que zero!");
        if(c.getSaldo() < valor) System.out.println("Saldo insuficiente.");

        this.sacar(c, valor);
        this.depositar(c2, valor);
    }

    public int generateId() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            sb.append(random.nextInt(10));
        }

        return Integer.parseInt(sb.toString());
    }


}
