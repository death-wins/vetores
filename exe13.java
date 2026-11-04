import java.util.Scanner;
public class exe13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int a[], i;
        boolean palin = true;
        a = new int[TAM];
        
        for(i=0;i<TAM;i++) {
            System.out.println("Digite o valor de A "+(i+1));
            a[i] = ler.nextInt();
        }
        for(i=0;i<5;i++) {
            if(a[i]!= a[TAM-1-i]) {
                palin = false;
                break;
            }
        }
        if(palin==true) {
            System.out.println("o vetor A e um palindromo");
        } else {
            System.out.println("o vetor A nao e um palindromo");
        }
        ler.close();
    }
}
