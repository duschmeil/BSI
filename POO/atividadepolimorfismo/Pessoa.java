public class Pessoa {
    String nome;
    int idade;
    double altura;

    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
        this.altura = 0.0;
    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public void falar() {
        System.out.println(nome + " está falando.");
    }

    public void apresentar() {
        System.out.println("Sou " + nome + ", tenho " + idade + " anos e " + altura + "m de altura.");
    }
}
