import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor para leitura: ");
        int valor = sc.nextInt();

        for(int i = 0; i < valor; i++){
            System.out.print("Digite um valor: ");
            double valorUm = sc.nextInt();
            System.out.print("Digite um outro valor: ");
            double valorDois = sc.nextInt();

            if(valorDois == 0){
                System.out.println("Divisão Impossivel!");
            }else{
                double resultado = (valorUm) / (valorDois);
                System.out.printf("Resultado: %.1f\n", resultado);
            }
        }

        System.out.println("\nAcabou!");

        sc.close();
    }

}
