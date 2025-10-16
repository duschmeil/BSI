package POO.aula4.atividade;

public class Transacao {
    public double valor;
    public String tipo;
    public int conta;

    public Transacao(double valor, String tipo, int conta) {
        this.valor = valor;
        this.tipo = tipo;
        this.conta = conta;
    }

    public int getConta() {
        return conta;
    }

    @Override public String toString() {
        return "VALOR: " + valor + " | TIPO: " + tipo + " | CONTA: " + conta;
    }
}

