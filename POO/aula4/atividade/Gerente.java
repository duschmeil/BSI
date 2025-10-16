package POO.aula4.atividade;

import java.util.ArrayList;
import java.util.List;

public class Gerente {
    private String nome;
    private List<Integer> contasDosClientes = new ArrayList<>();

    public Gerente(String nome) { this.nome = nome; }

    public String getNome() { return nome; }

    public List<Integer> getContasDosClientes() { return contasDosClientes; }

    public void adicionarContaCliente(int numConta) {
        if (!contasDosClientes.contains(numConta)) {
            contasDosClientes.add(numConta);
        }
    }
}
