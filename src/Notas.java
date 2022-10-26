package lacosdowhile;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor, soma = 0.0;
        double media;
        int cont = 0;
       do {
            System.out.print("Digite um número: ");
            valor = entrada.nextDouble();
            if (valor != -1) {
                soma = soma + valor;
                cont++;
            }
        } while (valor != -1);
        media = soma / cont;
        System.out.println("Quantidade de valores digitados: " + cont);
        System.out.println("A soma dos valores digitados é: " + soma);
    System.out.println("A média dos valores digitados é: " + media);

    }
}
