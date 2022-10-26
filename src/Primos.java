import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        int inicio, fim, primo = 0;
        System.out.print("Digite um número inteiro para o início:");
        Scanner entrada = new Scanner(System.in);
        inicio = entrada.nextInt();
        System.out.println(inicio);
        System.out.print("Digite um número inteiro para o fim:");
        fim = entrada.nextInt();
        System.out.println(fim);
        for (int i=inicio; i<=fim;i++){
            for (int j=1; j<=i;j++){
                if (i%j ==0){
                    primo++;
                }
            }
            if (primo ==2){
                System.out.println("o número " + i + " é primo");
            }
            primo = 0;
        }
        entrada.close();

        // armazenar esse numero num array
    }
}
