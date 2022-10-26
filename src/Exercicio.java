import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    int tamanho = getNumber(ent);
       int[] valores = new int[tamanho];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = getNumber(ent);
        }
        double media = calculaMedia(valores);
        System.out.println("a media dos " + tamanho + " valores é " + media);
    }
    private static double calculaMedia(int[] valores) {
       double soma = 0;
        for (int valor : valores) {
            soma += valor;

        }
//        for (int i = 0; i < valores.length; i++) {
//            int valor = valores [i];
//            soma += soma;
//
//        }
       return soma /= valores.length;
    }

    static int getNumber(Scanner input) {
        System.out.print("Digite o valor desejado: ");
        return input.nextInt();
    }
}


