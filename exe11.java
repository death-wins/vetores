import java.util.Scanner;

public class exe11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM = 10;
        int a[], i, j ;
        a = new int[TAM];
        
        for(i=0;i<TAM;i++) {
            System.out.println("Digite o valor de A "+(i+1));
            a[i]=ler.nextInt();
        }
        System.out.println("escreva o valor que voce deseja encontrar em A");
        j=ler.nextInt();
        for(i=0;i<TAM;i++) {
                if(j==a[i]) {
                	System.out.println("esse valor esta armazenado em A[" +(i+1)+"] <-----" );
                }
                else {
                	System.out.println("esse valor nao esta armazenado em A[" +(i+1)+"]");
                } 
        }
        ler.close();
    }
}
    