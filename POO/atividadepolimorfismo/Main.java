public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Aluno("Lucas", 20, 1.75, "Sistemas de Informação");
        Pessoa p2 = new Professor("Maria", 40, 1.68, 4500.0);
        Pessoa p3 = new Funcionario("João", 30, 1.80, "Analista");

        if (p1 instanceof Aluno) {
            ((Aluno) p1).estudar();
        }

        if (p2 instanceof Professor) {
            ((Professor) p2).ensinar();
        }

        if (p3 instanceof Funcionario) {
            ((Funcionario) p3).trabalhar();
        }

        chamarApresentacao(p1);
        chamarApresentacao(p2);
        chamarApresentacao(p3);
    }

    public static void chamarApresentacao(Pessoa p) {
        p.apresentar();
    }
}
