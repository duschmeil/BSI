package POO.aula1;

public class Garrafinha {
    String corTampa;
    Boolean tampada;
    String material;
    Boolean transparente;
    Integer nivel;

    public Garrafinha(String corTampa, Boolean tampada, String material, Boolean transparente, Integer nivel) {
        this.corTampa = corTampa;
        this.tampada = tampada;
        this.material = material;
        this.transparente = transparente;
        this.nivel = nivel;
    }

    public void beber () {
        if (nivel > 0 & tampada == false) {
            System.out.println("Tomando da garrafa...");
        } else {
            System.out.println("Você não consegue tomar da garrafa");
        }
    }

    public void encher () {
        if (nivel < 100 & tampada == false) {
            System.out.println("Enchendo a garrafa...");
        } else {
            System.out.println("Você não consegue encher a garrafa");
        }
    }
}
