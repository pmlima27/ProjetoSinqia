import java.util.InputMismatchException;
import java.util.Scanner;

public class arquivo {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int tamanho = getNumber(ent);
        int[][] tabuleiro = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                tabuleiro[i][j] =getNumber(ent);
            }
        }

        for (int [] linha : tabuleiro) {
            for (int elemento : linha){
                System.out.print(elemento + " ");
            }
            System.out.print("\n");
        }

    }
    static int getNumber(Scanner input) {
        try {
            System.out.print("Digite o valor desejado: ");
            return input.nextInt();
        } catch (InputMismatchException e) {
            input.nextLine();
            System.out.println("O tipo digitado está incorreto. Tente novamente.");
            return getNumber(input);
        }  catch (Exception e) {
            input.nextLine();
            System.out.println("Não foi possivel obter o número.");
            return getNumber(input);
        }
        }

    }
