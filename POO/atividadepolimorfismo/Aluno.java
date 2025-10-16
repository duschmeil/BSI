public class Aluno extends Pessoa {
    String curso;

    public Aluno(String nome, int idade, double altura, String curso) {
        super(nome, idade, altura);
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou o aluno " + nome + " do curso de " + curso + ".");
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");
    }
}
