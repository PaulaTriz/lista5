package Lista5.bloco2;
import java.util.Scanner;

public class Exercico1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            soma += i;
        }
        System.out.println("Soma = " + soma);

        sc.close();
    }
}
