package POO.aula1.ex;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = sc.next();
        System.out.println("Digite sua data de nascimento: ");
        String dataDeNasc = sc.next();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Digite sua altura em cm: ");
        int altura = sc.nextInt();
        System.out.println("Digite a primeira letra do nome da sua mãe: ");
        String inicialMae = sc.next();

        System.out.println(nome);
        System.out.println(dataDeNasc);
        System.out.println(idade);
        System.out.println(altura);
        System.out.println(inicialMae);

        sc.close();
    }
}
