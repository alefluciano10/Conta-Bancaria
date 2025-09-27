import java.util.Scanner;

public class Conta_Bancaria {
    public static void main(String[] args) {

        // Declaração de variáveis
        String cliente = "João";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        Scanner ler = new Scanner(System.in);

        while (opcao != 4) {

            // Cabeçalho do cliente
            System.out.println("\n=======================================");
            System.out.println("           DADOS DO CLIENTE            ");
            System.out.println("=======================================");
            System.out.printf("Nome: %-20s Tipo de Conta: %-10s%n", cliente, tipoConta);
            System.out.printf("Saldo atual: R$ %.2f%n", saldo);
            System.out.println("=======================================\n");

            // Menu de operações
            System.out.println("********** MENU DE OPERAÇÕES **********");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Transferir valor");
            System.out.println("3 - Receber valor");
            System.out.println("4 - Sair");
            System.out.println("***************************************\n");
            System.out.print("Escolha a operação: ");

            // Leitura da opção
            if (!ler.hasNextInt()) {
                System.out.println("Opção inválida! Digite um número entre 1 e 4.\n");
                ler.next(); // descarta a entrada inválida
                continue;
            }

            opcao = ler.nextInt();
            System.out.println(); // espaçamento

            switch (opcao) {
                case 1:
                    System.out.println(">>> CONSULTA DE SALDO <<<");
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    System.out.println("---------------------------------------\n");
                    break;

                case 2:
                    System.out.println(">>> TRANSFERÊNCIA <<<");
                    System.out.print("Digite o valor que deseja transferir: R$ ");
                    if (!ler.hasNextDouble()) {
                        System.out.println("Valor inválido!\n");
                        ler.next(); // descarta entrada inválida
                        break;
                    }
                    double valorTransferencia = ler.nextDouble();
                    if (valorTransferencia > saldo) {
                        System.out.println("Não há saldo suficiente para a transferência.");
                    } else {
                        saldo -= valorTransferencia;
                        System.out.printf("Transferência realizada! Saldo atualizado: R$ %.2f%n", saldo);
                    }
                    System.out.println("---------------------------------------\n");
                    break;

                case 3:
                    System.out.println(">>> RECEBIMENTO <<<");
                    System.out.print("Digite o valor a ser recebido: R$ ");
                    if (!ler.hasNextDouble()) {
                        System.out.println("Valor inválido!\n");
                        ler.next(); // descarta entrada inválida
                        break;
                    }
                    double valorRecebido = ler.nextDouble();
                    saldo += valorRecebido;
                    System.out.printf("Depósito realizado! Saldo atualizado: R$ %.2f%n", saldo);
                    System.out.println("---------------------------------------\n");
                    break;

                case 4:
                    System.out.println("Saindo do sistema... Obrigado por utilizar nosso banco!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }
        }

        ler.close();
    }
}
