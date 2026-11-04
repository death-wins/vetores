
import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int i, j, a[];
        a = new int[TAM];
    

        for (i = 0; i < TAM; i++) {
            System.out.println("Digite o " + (i + 1) + "º número de A:");
            a[i] = ler.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            boolean primo = true;

            if (a[i] < 2) {
                primo = false;
            } else {
                for (j = 2; j * j <= a[i]; j++) {
                    if (a[i] % j == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                System.out.println(a[i] + " é primo");
            } else {
                System.out.println(a[i] + " não é primo");
            }
        }

        ler.close();
    }
}