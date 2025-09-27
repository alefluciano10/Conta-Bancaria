import java.util.Scanner;

public class Conta_Bancaria {
    public static void main(String[] args) {

        // Declaração ee variáveis

        String cliente = "João";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        // Informações do cliente

        System.out.println();
        System.out.println("*************************");
        System.out.println("\nNome do cliente: " + cliente);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*************************");
        System.out.println();

        // Menu de operações

        String operacoes = """
                ** Operações disponíveis **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair

               """;

        // Lógica e leitura de dados

        Scanner ler = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(operacoes);
            opcao = ler.nextInt();
        }
    }
}
