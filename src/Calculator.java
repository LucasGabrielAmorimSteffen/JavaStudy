import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1 - Adicao");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            int opcao = input.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando... Ate logo!");
                break;
            }

            System.out.print("Digite o primeiro numero: ");
            double a = input.nextDouble();

            System.out.print("Digite o segundo numero: ");
            double b = input.nextDouble();

            switch (opcao) {
                case 1:
                    adicao(a, b);
                    break;
                case 2:
                    subtracao(a, b);
                    break;
                case 3:
                    multiplicacao(a, b);
                    break;
                case 4:
                    divisao(a, b);
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }

        input.close();
    }

    public static void adicao(double a, double b) {
        System.out.println("Resultado: " + (a + b));
    }

    public static void subtracao(double a, double b) {
        System.out.println("Resultado: " + (a - b));
    }

    public static void multiplicacao(double a, double b) {
        System.out.println("Resultado: " + (a * b));
    }

    public static void divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
        } else {
            System.out.println("Resultado: " + (a / b));
        }
    }
}