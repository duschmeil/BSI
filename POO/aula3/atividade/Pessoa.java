package POO.aula3.atividade;

public class Pessoa {
    public String nome;
    public int idade;
    public int altura;
    public int peso;
    public String email;

    Pessoa() {
        nome = "desconhecido";
        idade = 0;
        altura = 0;
        peso = 0;
        email = "desconhecido";
    }

    public Pessoa(String nome, int idade, int altura, int peso, String email) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getAltura() {
        return altura;
    }

    public int getPeso() {
        return peso;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            System.out.println("Idade inválida");
        } else {
            this.idade = idade;
        }
    }

    public void setAltura(int altura) {
        if(altura <= 0) {
            System.out.println("Altura inválida");
        } else {
            this.altura = altura;
        }
    }

    public void setPeso(int peso) {
        if(peso <= 0) {
            System.out.println("Peso inválido");
        } else {
            this.peso = peso;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override public String toString() {
        return "NOME: " + nome + " | IDADE: " + idade + " | ALTURA: " + altura + " | PESO: " + peso + "| EMAIL: " + email;
    }
}
