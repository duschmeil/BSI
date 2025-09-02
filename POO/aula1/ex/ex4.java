package POO.aula1.ex;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número(a): ");
        double n1 = sc.nextInt();
        System.out.println("Digite o segundo número(b)");
        double n2 = sc.nextInt();
        System.out.println("Digite o terceiro número(c)");
        double n3 = sc.nextInt();
        double b2 = Math.pow(n2, 2);
        double delta = b2 - 4 * n1 * n3;
        double raizDelta = Math.sqrt(delta);
        if (delta < 0) {
            System.out.println("A equação não possui raízes ");
        }
        else {
            double x1 = (-n2 + raizDelta)/ (2*n1);
            double x2 = (-n2 - raizDelta)/ (2*n1); 

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
            sc.close();
    }
}