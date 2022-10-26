import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetores2 {
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
                boolean result = false;
                int valor = 0;
                while (!result) {

                    try {
                        System.out.print("Digite o valor desejado: ");
                        valor = input.nextInt();
                        result = true;
                    } catch (InputMismatchException e) {
                        input.nextLine();
                        System.out.println("O tipo digitado está incorreto. Tente novamente.");
                        return getNumber(input);
                    } catch (Exception e) {
                        input.nextLine();
                        System.out.println("Não foi possivel obter o número.");
                        return getNumber(input);
                    }
                }
            return valor;
        }

    }
