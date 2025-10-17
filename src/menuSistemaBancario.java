import java.util.Scanner;

public class menuSistemaBancario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo = 0;

        while (true) {
            System.out.println("\n========================================");
            System.out.println("Banco 171 do Buzeira");
            System.out.println("========================================");
            System.out.println("1 | Depositar Dinheiro");
            System.out.println("2 | Sacar Dinheiro");
            System.out.println("3 | Ver saldo atual");
            System.out.println("4 | Sair do sistema");
            System.out.print("Escolha uma opção: ");

            int opcao = input.nextInt();

            if (opcao == 4) {
                System.out.println("Encerrando...");
                break;
            }

            switch (opcao) {
                case 1:
                    saldo = depositar(saldo, input);
                    break;
                case 2:
                    saldo = sacar(saldo, input);
                    break;
                case 3:
                    verSaldo(saldo);
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }

        input.close();
    }

    public static double depositar(double saldo, Scanner input) {
        System.out.print("Digite o valor que deseja depositar: ");
        double valor = input.nextDouble();
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        return saldo;
    }

    public static double sacar(double saldo, Scanner input) {
        System.out.print("Digite o valor que deseja sacar: ");
        double valor = input.nextDouble();

        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }

        return saldo;
    }

    public static void verSaldo(double saldo) {
        System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
    }
}
