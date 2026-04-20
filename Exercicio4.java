package Lista5;
import java.util.Scanner;

public class Exercicio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 50; i >= 1; i--) {
            System.out.println(i % 2 != 0 ? i : "");

            sc.close();
        }

    }
}
