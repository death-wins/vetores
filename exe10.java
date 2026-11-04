import java.util.Scanner;
public class exe10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM=10;
        int a[],b[],c[],i,j,k = 0;
        a=new int[TAM];
        b=new int[TAM];
        c=new int[TAM];
        boolean existe;

        for(i=0;i<TAM;i++) {
            System.out.println("Digite o valor de A "+(i+1));
            a[i]=ler.nextInt();
        }

        for(i=0;i<TAM;i++) {
            System.out.println("Digite o valor de B "+(i+1));
            b[i]=ler.nextInt();
        }

        for(i=0;i<TAM;i++) {
            existe=false;
            for(j=0;j<TAM;j++) {
                if(a[i]==b[j]) {
                    existe = true;
                    break;
                }
            }
            if(existe==false) {
                c[k] = a[i];
                k++;
            }
        }
        
        System.out.println("diferença dos numeros:");
        
    	System.out.print("\nC = [");
    	for(i=0;i<k;i++) {
    		System.out.print(c[i]+" ");
    	}
    	System.out.print("]");
        ler.close();
    }
}

