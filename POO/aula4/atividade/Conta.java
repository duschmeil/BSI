package POO.aula4.atividade;

public class Conta {
    public int numConta;
    public double saldo;

    public Conta(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
}
