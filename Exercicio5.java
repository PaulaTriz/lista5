package Lista5;
import java.util.Scanner;

public class Exercicio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o limite do seu número: ");
        int limite = sc.nextInt();

        for (int i = 0; i <= limite; i++) {
            System.out.println(i);

            sc.close();
        }
    }
}
