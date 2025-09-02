package POO.aula1.ex;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        int div = n1 / n2 ;
        int mult = n1 * n2;
        int sub = n1 - n2;
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A subtração dos números é: " + sub);
        System.out.println("A mult dos números é: " + mult);
        System.out.println("A div dos números é: " + div);
        sc.close();
    }
}