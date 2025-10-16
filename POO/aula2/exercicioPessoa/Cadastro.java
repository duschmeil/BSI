package POO.aula2.exercicioPessoa;
import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        while (true) {
            System.out.println("1. Cadastrar");
            System.out.println("2. Listar todas as pessoas");
            System.out.println("3. Buscar pessoa por nome");
            System.out.println("4. Atualizar dados de uma pessoa");
            System.out.println("5. Remover pessoa pelo nome");
            System.out.println("6. Sair");

            int escolha = sc.nextInt();
;
            if (escolha == 1) {
                System.out.println("CADASTRAR UMA PESSOA");
                System.out.println("Digite o NOME da pessoa: ");
                String nomeTemp = sc.next();
                System.out.println("Digite a IDADE da pessoa: ");
                int idadeTemp = sc.nextInt();
                System.out.println("Digite o TELEFONE da pessoa: ");
                String telTemp = sc.next();
                System.out.println("Digite o EMAIL da pessoa: ");
                String emailTemp = sc.next();

                Pessoa pessoaTemp = new Pessoa(nomeTemp, idadeTemp, telTemp, emailTemp);

                pessoas.add(pessoaTemp);

                System.out.println("Deseja continuar? [S/N]");
                String escolhaContinuar = sc.next();
                escolhaContinuar = escolhaContinuar.toUpperCase();
                if (escolhaContinuar.equals("N")) {
                    break;
                }
            }

            if (escolha == 2) {
                System.out.println("LISTA DE TODAS AS PESSOAS: ");
                for (Pessoa p : pessoas) {
                    System.out.println(p);
                }


                System.out.println("Deseja continuar? [S/N]");
                String escolhaContinuar = sc.next();
                escolhaContinuar = escolhaContinuar.toUpperCase();
                if (escolhaContinuar.equals("N")) {
                    break;
                }
            }

            if (escolha == 3) {
                System.out.println("DIGITE O NOME QUE VOCÊ DESEJA BUSCAR: ");
                String nomeBuscar = sc.next();
                boolean resultadoBusca = false;
                for (Pessoa p : pessoas) {
                    if (p.nome.equals(nomeBuscar)) {
                        System.out.println("Nome Encontrado" + p);
                        resultadoBusca = true;
                        break;
                    }
                }
                if (!resultadoBusca) {
                    System.out.println("Pessoa não encontrada!");
                }
            }

            if (escolha == 4) {
                int count = -1;
                System.out.println("DIGITE O NOME DA PESSOA QUE VOCÊ DESEJA ATUALIZAR: ");
                String nomeBuscar = sc.next();
                for (Pessoa p : pessoas) {
                    count++;
                    if (p.nome.equals(nomeBuscar)) {
                        System.out.println("Digite o novo NOME da pessoa: ");
                        String nomeTemp = sc.next();
                        System.out.println("Digite a nova IDADE da pessoa: ");
                        int idadeTemp = sc.nextInt();
                        System.out.println("Digite o novo TELEFONE da pessoa: ");
                        String telTemp = sc.next();
                        System.out.println("Digite o novo EMAIL da pessoa: ");
                        String emailTemp = sc.next();

                        Pessoa pessoaTemp = new Pessoa(nomeTemp, idadeTemp, telTemp, emailTemp);

                        pessoas.set(count, pessoaTemp);

                        System.out.println("Dados atualizados com sucesso!");

                        break;
                    }
                }
                System.out.println("Nome não encontrado!");
            }

            if (escolha == 5) {
                System.out.println("5. Remover pessoa pelo nome");
                System.out.println("DIGITE O NOME DA PESSOA QUE VOCÊ DESEJA REMOVER: ");
                String nomeBuscar = sc.next();
                int count = -1;
                for (Pessoa p : pessoas) {
                    count++;
                    if (p.nome.equals(nomeBuscar)) {
                        pessoas.remove(count);
                        System.out.println("Pessoa removida com sucesso!");
                        break;
                    }
                }
                System.out.println("Nome não encontrado!");
            }

            if (escolha == 6) {
                break;
            }
        }
    }
}
