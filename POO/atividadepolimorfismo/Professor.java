public class Professor extends Pessoa {
    double salario;

    public Professor(String nome, int idade, double altura, double salario) {
        super(nome, idade, altura);
        this.salario = salario;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o professor " + nome + " e ganho R$" + salario);
    }

    public void ensinar() {
        System.out.println(nome + " está ensinando.");
    }
}
