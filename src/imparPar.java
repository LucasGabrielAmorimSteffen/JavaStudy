import java.util.Scanner;

public class imparPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("O numero " + num + " e PAR.");
        }else{
            System.out.println("O numero " + num + "  e IMPAR.");
        }

        input.close();
    }
}