import java.util.Scanner;
public class exe12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        final int TAM=10;
        int senha[],i,fim,opcao;
        senha = new int[TAM];
        fim = 0;

        do {
            System.out.println("\n-FILA DA MERENDA-");
            System.out.println("1 - cadastrar senha");
            System.out.println("2 - chamar proxima senha");
            System.out.println("3 - mostrar fila");
            System.out.println("0 - Sair");
            System.out.println("escolha uma opcao:");
            opcao=ler.nextInt();
            if(opcao == 1) {
                if(fim<TAM) {
                    System.out.println("digite a senha:");
                    senha[fim]=ler.nextInt();
                    fim++;
                    System.out.println("senha cadastrada!");
                }
                if(fim<TAM) {
                    System.out.println("digite a senha:");
                    senha[fim]=ler.nextInt();
                    fim++;
                    System.out.println("senha cadastrada!");
                }
                else {
                    System.out.println("fila cheia!");
                }
            }

            else if(opcao == 2) {
                if(fim > 0) {
                    System.out.println("fenha chamada: "+senha[0]);
                    for(i = 0;i < fim - 1;i++) {
                        senha[i]=senha[i+1];
                    }
                    fim--;
                }
                else {
                    System.out.println("fila vazia!");
                }
            }
            else if(opcao==3) {
                if(fim>0) {
                    for(i=0;i<fim;i++) {
                        System.out.println("senha: "+senha[i]);
                    }
                }
                else {
                    System.out.println("fila vazia!");
                }
            }
        } while(opcao!=0);
        ler.close();
    }
}
