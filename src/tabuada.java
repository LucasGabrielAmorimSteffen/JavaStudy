import java.util.Scanner;

public class tabuada {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("\n\n\nBem-Vindo ao sistema de Calculo de Tabuadas!");
            System.out.println("============================================");
            System.out.print("Digite um numero: ");
            float num = input.nextFloat();

            if(num == 0){
                System.out.println("Não é possível realizar multiplicação por " + num);
                break;
            }

            System.out.println("\n\n\nTabuada do " + num);
            System.out.println("============================================");
            for(int i = 1; i <= 10; i++){
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            System.out.println("============================================");

            System.out.print("\nVoce deseja fazer uma multiplicacao personalizada? (s/n): ");
            input.nextLine();
            String resposta = input.nextLine();

            if (ehSim(resposta)) {
                tabuadaPersonalizada(input);
            } else if (ehNao(resposta)) {
                System.out.println("Encerrando...");
                break;
            } else {
                System.out.println("Resposta inválida, encerrando por segurança...");
                break;
            }
        }
        input.close();
    }

    public static void tabuadaPersonalizada(Scanner input){
        System.out.print("Digite o primeiro numero: ");
        float num1 = input.nextFloat();
        System.out.print("Digite o segundo numero: ");
        float num2 = input.nextFloat();

        float result = num1 * num2;
        System.out.println("O resultado de " + num1 + " x " + num2 + " = " + result);
    }

    public static boolean ehSim(String texto) {
        texto = texto.trim().toLowerCase();
        return texto.equals("s") || texto.equals("sim");
    }

    public static boolean ehNao(String texto) {
        texto = texto.trim().toLowerCase();
        return texto.equals("n") || texto.equals("nao") || texto.equals("não");
    }
}
