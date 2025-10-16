public class Funcionario extends Pessoa {
    String cargo;

    public Funcionario(String nome, int idade, double altura, String cargo) {
        super(nome, idade, altura);
        this.cargo = cargo;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o funcionário " + nome + " e trabalho como " + cargo + ".");
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }
}
