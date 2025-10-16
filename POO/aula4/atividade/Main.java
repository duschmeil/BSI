package POO.aula4.atividade;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Transacao> transacoes = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Conta> contas = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();

        while (true) {
            System.out.println("1. Cadastrar");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Extrato");
            System.out.println("5. Alterar Informações Cadastrais");
            System.out.println("6. Sair");
            System.out.println("7. Listar clientes por gerente");

            int escolha = sc.nextInt();
            sc.nextLine();

            if (escolha == 1) {
                System.out.println("Digite o nome: ");
                String nomeTemp = sc.nextLine();
                System.out.println("Digite a idade: ");
                int idadeTemp = sc.nextInt();
                System.out.println("Digite o número de conta: ");
                int numContaTemp = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite o e-mail: ");
                String emailTemp = sc.nextLine();
                System.out.println("Digite o CPF: ");
                int cpfTemp = sc.nextInt();
                System.out.println("Digite o saldo da conta: ");
                double saldoTemp = sc.nextDouble();
                sc.nextLine();
                System.out.println("Digite o NOME do gerente: ");
                String nomeGerente = sc.nextLine();

                Pessoa pessoaTemp = new Pessoa(nomeTemp, idadeTemp, numContaTemp, emailTemp, cpfTemp);
                pessoas.add(pessoaTemp);

                Conta contaTemp = new Conta(numContaTemp, saldoTemp);
                contas.add(contaTemp);

                Gerente gEncontrado = null;
                for (Gerente g : gerentes) {
                    if (g.getNome().equalsIgnoreCase(nomeGerente)) {
                        gEncontrado = g; break;
                    }
                }
                if (gEncontrado == null) {
                    gEncontrado = new Gerente(nomeGerente);
                    gerentes.add(gEncontrado);
                }
                gEncontrado.adicionarContaCliente(numContaTemp);

                System.out.println("Conta cadastrada com sucesso!");
            }

            if (escolha == 2) {
                System.out.println("Digite o número de conta: ");
                int numContaTemp = sc.nextInt();
                System.out.println("Digite o valor que deseja Sacar: ");
                double valorTemp = sc.nextDouble();

                Conta contaTemp = null;
                for (Conta c : contas) {
                    if (c.getNumConta() == numContaTemp) {
                        double saldoTemp = c.getSaldo();
                        if (saldoTemp < valorTemp) {
                            System.out.println("Saldo Insuficiente!");
                        } else {
                            saldoTemp -= valorTemp;
                            c.setSaldo(valorTemp);
                            System.out.println("R$" + valorTemp + " sacados com sucesso!");
                            Transacao transacaoTemp = new Transacao(valorTemp, "saque", numContaTemp);
                        }
                    }
                }
            }

            if (escolha == 3) {
                System.out.println("Digite o número da conta: ");
                int numContaTemp = sc.nextInt();
                System.out.println("Digite o valor que deseja depositar: ");
                double valorTemp = sc.nextDouble();

                Conta contaTemp = null;
                for (Conta c : contas) {
                    if (c.getNumConta() == numContaTemp) {
                        double saldoTemp = c.getSaldo();
                        saldoTemp += valorTemp;
                        c.setSaldo(saldoTemp);
                        System.out.println("R$" + valorTemp + " depositados com sucesso");
                        Transacao transacaoTemp = new Transacao(valorTemp, "deposito", numContaTemp);
                    }
                }
            }

            if (escolha == 4) {
                System.out.println("Digite o número da conta que deseja ver o extrato: ");
                int numContaTemp = sc.nextInt();
                for (Transacao t : transacoes) {
                    if (t.getConta() == numContaTemp) {
                        System.out.println(t);
                    }
                }
            }

            if (escolha == 5) {
                System.out.println("Digite o número da conta que deseja alterar as informações: ");
                int numContaTemp = sc.nextInt();
                for (Pessoa p : pessoas) {
                    if (p.getNumConta() == numContaTemp) {
                        System.out.println("Digite o novo NOME: ");
                        String nomeTemp = sc.next();
                        p.setNome(nomeTemp);
                        System.out.println("Digite a nova IDADE: ");
                        int idadeTemp = sc.nextInt();
                        p.setIdade(idadeTemp);
                        System.out.println("Digite o novo EMAIL: ");
                        String emailTemp = sc.next();
                        p.setEmail(emailTemp);
                        System.out.println("Digite o novo CPF: ");
                        int cpfTemp = sc.nextInt();
                        p.setCpf(cpfTemp);
                    }
                    System.out.println("Dados Atualizados com sucesso!");
                }
            }

            if (escolha == 6) {
                break;
            }

            if (escolha == 7) {
                System.out.println("Digite o NOME do gerente: ");
                String nomeGerente = sc.nextLine();

                Gerente alvo = null;
                for (Gerente g : gerentes) {
                    if (g.getNome().equalsIgnoreCase(nomeGerente)) {
                        alvo = g; break;
                    }
                }

                if (alvo == null) {
                    System.out.println("Gerente não encontrado.");
                } else {
                    System.out.println("Clientes do gerente " + alvo.getNome() + ":");
                    if (alvo.getContasDosClientes().isEmpty()) {
                        System.out.println("(sem clientes)");
                    } else {
                        for (int numConta : alvo.getContasDosClientes()) {
                            String nomeCliente = "(cliente não encontrado)";
                            for (Pessoa p : pessoas) {
                                if (p.getNumConta() == numConta) {
                                    nomeCliente = p.getNome(); break;
                                }
                            }
                            System.out.println("- Conta " + numConta + " | " + nomeCliente);
                        }
                    }
                }
            }
        }
    }
}
