package Lista5.bloco2;
import java.util.Scanner;

public class Exercico3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        double soma = 0;

        while (i <= 5) {
            System.out.println("Digite a nota " + i + ": ");
            soma += sc.nextDouble();
            i++;
        }
        double media = soma / 5;
        System.out.println("Media = " + media);

        sc.close();
    }
}
