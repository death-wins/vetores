

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM=5;
    	int a[],b[],c[],i;
    	a = new int[TAM];
    	b = new int[TAM];
    	c = new int[TAM];
    	
    	for (i=0; i<TAM;i++) {
    		System.out.println("Digite o valor de A "+(i+1)+"o numero");
    		a[i] = ler.nextInt();
    	}
    	
    	for(i=0; i<TAM;i++) {
    		System.out.println("Digite o valor de B "+(i+1)+"o numero");
    		b[i] = ler.nextInt();
    	}
    	
    	System.out.print("\nC = [");
    	for(i=0;i<TAM;i++) {
    		c[i] = a[i]*b[i];
    		System.out.print(c[i]+" ");
    	}
    	
    	System.out.print("]");
        ler.close();
    }
}