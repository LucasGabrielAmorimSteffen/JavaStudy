import java.util.Scanner;

public class conversorTemperaturas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double c = 0;
        double f = 0;

        while(true){
            System.out.println("Qual unidade de temperatura você deseja converter?");
            System.out.println("1- Celsius");
            System.out.println("2- Fahrenheit");
            System.out.println("3- Sair");
            System.out.print("Escolha uma das opções acima:");

            int opcao = input.nextInt();

            if(opcao == 3){
                System.out.println("Encerrando...");
                break;
            }

            switch (opcao){
                case 1:
                    celsiusConverter(c, input);
                    break;
                case 2:
                    fahrenheitConverter(f, input);
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }

        input.close();
    }

    public static void celsiusConverter(double c, Scanner input){
        System.out.println("Digite quantos Celsius quer converter: ");
        c = input.nextDouble();
        double resultado = (c * 9/5) + 32;
        double f = resultado;

        System.out.println("\n_____________________________________________________");
        System.out.println(c + " Celsius é igual a " + f + " Fahrenheit");
        System.out.println("_____________________________________________________");
    }

    public static void fahrenheitConverter(double f, Scanner input){
        System.out.println("Digite quantos Fahrenheit quer converter: ");
        f = input.nextDouble();
        double resultado = -32 * 5/9;
        double c = resultado;

        System.out.println("\n_____________________________________________________");
        System.out.println(f + " Fahrenheit é igual a " + c + " Celsius");
        System.out.println("_____________________________________________________");
    }
}
