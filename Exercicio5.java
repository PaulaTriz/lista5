package Lista5.bloco2;
import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite: ");
        int limite = sc.nextInt();

        for (int i = 0; i <= limite; i++) {
            System.out.println(i % 5 == 0 ? i : "");
        }
    }
}
