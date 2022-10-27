import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProjetoFinal {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner ent = new Scanner(System.in);
        String operacao = " ";
        while ((!operacao.equals("A")) && (!operacao.equals("H"))) {
            System.out.print("Escolha uma operação matemática:\n" + "[A] Média Aritmética\n" + "[H] Média Harmônica\n" + "Resposta: ");
            operacao = ent.next().toUpperCase();

        }

        System.out.print("Digite quantos números irá utilizar para o cálculo: ");
        int n = ent.nextInt();
        int cont = 1;
        while (cont <= n) {
            try {
                System.out.print("Digite o " + cont + "º número: ");
                int numeroLista = ent.nextInt();
                lista.add(numeroLista);
                cont++;
            } catch (InputMismatchException e) {
                System.out.println("O tipo digitado está incorreto. Tente novamente.");



            }

        }
        if (operacao.equals("A")) {
            double soma = 0;
            for(Integer item : lista) {
                soma += item;
            }
            double mediaAritmetica = soma / n;
            System.out.print("Números digitados: ");
            for(Integer item : lista) {
                System.out.print(item + " ");
            }
            System.out.println("\nA operação escolhida foi: MÉDIA ARITMÉTICA");
            System.out.println("A média aritmética é: " + mediaAritmetica);
        } else if (operacao.equals("H")) {
            double somaDosInversos = 0;
            for(Integer item : lista) {
                somaDosInversos += 1 / (double)item;
            }
            double mediaHarmonica = n / somaDosInversos;
            System.out.print("Números digitados: ");
            for(Integer item : lista) {
                System.out.print(item + " ");
            }
            System.out.println("\nA operação escolhida foi: MÉDIA HARMÔNICA");
            System.out.println("A média harmonica é: " + mediaHarmonica);
        }

    }
}


