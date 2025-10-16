package POO.aula4.atividade;

public class Pessoa {
    public String nome;
    public int idade;
    public int numConta;
    public String email;
    public int cpf;

    public Pessoa(String nome, int idade, int numConta, String email, int cpf) {
        this.nome = nome;
        this.idade = idade;
        this.numConta = numConta;
        this.email = email;
        this.cpf = cpf;
    }

    @Override public String toString() {
        return "NOME: " + nome + " | IDADE: " + idade + " | EMAIL: " + email + " | CPF: " + cpf + " | Número da Conta: " + numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
}
