package POO.aula2.exercicioPessoa;

public class Pessoa {
    public String nome;
    public int idade;
    public String telefone;
    public String email;

    public Pessoa(String nome, int idade, String telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
    }
    @Override public String toString() {
        return "NOME: " + nome + " | IDADE: " + idade + " | TELEFONE: " + telefone + " | EMAIL: " + email;
    }
}