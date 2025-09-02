package POO.aula1;

public class Main {
    public static void main(String[] args) {
        caneta c1 = new caneta("transparente", 100, 2.0, "verde", false);
        
        c1. rabiscar();

        Garrafinha g1 = new Garrafinha("Verde", false, "plastico", true, 100);

        g1.beber();
        g1.encher();
    }

}
