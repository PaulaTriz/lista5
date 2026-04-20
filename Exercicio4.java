package Lista5.bloco2;
import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 50; i++) {
            soma += (i % 2 == 0 ? i : 0);
        }
        System.out.println("Soma dos pares: " + soma);

        sc.close();
    }
}
