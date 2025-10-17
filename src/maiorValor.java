import java.util.Scanner;

public class maiorValor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int maior =  input.nextInt();
        System.out.print("Digite outro valor: ");
        int num2 =  input.nextInt();
        System.out.print("Digite outro valor: ");
        int num3 =  input.nextInt();
        if(num2 > maior){
            maior = num2;
        }
        if(num3 > maior){
            maior = num3;
        }

        System.out.println("Maior valor: " + maior);
    }
}
